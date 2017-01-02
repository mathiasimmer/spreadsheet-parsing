var PROJECT_FOLDER_PROP = "PROJECT_FOLDER";
var userProperties = PropertiesService.getUserProperties();

function reset(){
  PropertiesService.getUserProperties().deleteAllProperties();
}

function menuCGEditor() {
  var title = "Editor";
  var userInterface = HtmlService.createTemplateFromFile('CodeGenerationEditor');

  var projectFolderId = userProperties.getProperty(PROJECT_FOLDER_PROP);

  //Default editor content
  var editorContent = "function doGenerate(content, destination) {\n\
   //destination.generateFile('output.java', content);\n\
}";

  var filename = SpreadsheetApp.getActive().getName().replace(/[^a-z0-9]/gi, '_') + "Generator.sglg";

  if (projectFolderId == null) {
    userInterface.projectFolderId = "null";
    userInterface.projectFolder = "";
  } else {
    userInterface.projectFolderId = '"'+projectFolderId+'"';
    var projectFolder = DriveApp.getFolderById(projectFolderId);
    userInterface.projectFolder = projectFolder.getName();
    var existingFiles = projectFolder.getFilesByName(filename);

    if (existingFiles.hasNext()) {
      editorContent = existingFiles.next().getAs(MimeType.PLAIN_TEXT).getDataAsString();
    }
  }
  userInterface.editorContent = editorContent;
  userInterface = userInterface.evaluate().setTitle(title).setWidth(1200).setHeight(560);
  SpreadsheetApp.getActive().show(userInterface);

}


function getOAuthToken() {
  DriveApp.getRootFolder();
  return ScriptApp.getOAuthToken();
}


function onProjectFolderSelected(folderId) {
  Logger.log("Folder selected:" + folderId);

  userProperties.setProperty(PROJECT_FOLDER_PROP, folderId);
}


function saveCG(content) {
  Logger.log(content);
  var filename = SpreadsheetApp.getActive().getName().replace(/[^a-z0-9]/gi, '_') + "Generator.sglg";
  var projectFolderId = userProperties.getProperty(PROJECT_FOLDER_PROP);
  var projectFolder = DriveApp.getFolderById(projectFolderId);
  var existingFiles = projectFolder.getFilesByName(filename);
  
  if (existingFiles.hasNext()) {
    existingFiles.next().setContent(content); //Should really only be one file with the name.
  } else {
    projectFolder.createFile(filename, content, MimeType.PLAIN_TEXT);
  }

}


function getCodeGenerationScript(editorContent) {

  var html = HtmlService.createTemplateFromFile('CodeGenerationTemplate');
  html.code = editorContent;
  html.content = JSON.stringify(parse()[0]);

  return html.evaluate().getContent();
}


function saveFiles(filesJSON) {

  var files = JSON.parse(filesJSON);

  var projectFolderId = userProperties.getProperty(PROJECT_FOLDER_PROP);
  var projectFolder = DriveApp.getFolderById(projectFolderId);

  var existingFolders = projectFolder.getFoldersByName("src-gen");
  var srcgen;
  if (existingFolders.hasNext()) {
    srcgen = existingFolders.next();
  } else {
    srcgen = projectFolder.createFolder("src-gen")
  }

  var fs1 = generateFolderStructureFromDrive(srcgen);
  var fs2 = generateFolderStructureFromFilesList(files);

  var trash = getFilesAndFoldersToBeDeleted(fs1, fs2);
  deleteSubfoldersAndFiles(srcgen, trash);

  for (var i in files) {
    save(srcgen, i, files[i]);
  }
}


function deleteSubfoldersAndFiles(basefolder, fs) {
  for (var i in fs.folders) {
    var subfolders = basefolder.getFoldersByName(i);
    if (subfolders.hasNext()) {
      var folder = subfolders.next();
      deleteSubfoldersAndFiles(folder, fs.folders[i]);
      if (typeof fs.folders[i].trash !== 'undefined') {
        if (fs.folders[i].trash) {
          folder.setTrashed(true);
        }
      }
    }
  }

  for (var j in fs.files) {
    var filename = fs.files[j];
    var files = basefolder.getFilesByName(filename);
    if (files.hasNext()) {
      var file = files.next();
      file.setTrashed(true);
    }
  }
}


function getFilesAndFoldersToBeDeleted(fs1, fs2) {
  var trash = {
    folders: {},
    files: []
  };
  for (var key in fs1.folders) {
    if (typeof fs1.folders[key] === typeof fs2.folders[key]) {
      trash.folders[key] = getFilesAndFoldersToBeDeleted(fs1.folders[key], fs2.folders[key]);
    } else {
      trash.folders[key] = {
        trash: true
      };
    }
  }
  for (var j in fs1.files) {
    if (fs2.files.indexOf(fs1.files[j]) == -1) {
      trash.files.push(fs1.files[j]);
    }
  }
  return trash;
}


function generateFolderStructureFromFilesList(filesList) {
  var root = {
    folders: {},
    files: []
  };
  for (var file in filesList) {
    const regex = /^(.*\/)([^\/]*)$/gm;
    var m;
    var cFolder = root;

    while ((m = regex.exec(file)) !== null) {
      // This is necessary to avoid infinite loops with zero-width matches
      if (m.index === regex.lastIndex) {
        regex.lastIndex++;
      }

      var folderPath = m[1];
      var filename = m[2];
      var pathParts = folderPath.split('/');

      for (idx in pathParts) {
        var value = pathParts[idx];

        if (value == "") {
          continue;
        }

        if (typeof cFolder.folders[value] === 'undefined') {
          cFolder.folders[value] = {
            folders: {},
            files: []
          };
        }
        cFolder = cFolder.folders[value];

      }
      cFolder.files.push(filename);
    }
  }
  return root;
}


function generateFolderStructureFromDrive(folder) {
  var folders = folder.getFolders();
  var files = folder.getFiles();
  var content = {
    folders: {},
    files: []
  };

  while (folders.hasNext()) {
    var next = folders.next();
    content.folders[next.getName()] = generateFolderStructureFromDrive(next);
  }

  while (files.hasNext()) {
    content.files.push(files.next().getName())
  }

  return content;
}


function save(baseFolder, file, content) {
  var targetFolder = baseFolder;

  const regex = /^(.*\/)?([^\/]*)$/gm;
  var m;

  while ((m = regex.exec(file)) !== null) {
    // This is necessary to avoid infinite loops with zero-width matches
    if (m.index === regex.lastIndex) {
      regex.lastIndex++;
    }

    var folderPath = m[1];
    var filename = m[2];

    if (typeof folderPath != "undefined" && typeof filename != "undefined") {

      var pathParts = folderPath.split('/')
      for (idx in pathParts) {
        var value = pathParts[idx];
        if (value == "") {
          continue;
        }

        var existingFolders = targetFolder.getFoldersByName(value);

        if (existingFolders.hasNext()) {
          targetFolder = existingFolders.next();
        } else {
          Logger.log("Creating folder : " + value);
          targetFolder = targetFolder.createFolder(value);
        }

      }
    }
    Logger.log("Creating file " + filename);
    var existingFiles = targetFolder.getFilesByName(filename);
    if (existingFiles.hasNext()) {
      var existingFile = existingFiles.next();
      existingFile.setContent(content);
    } else {
      targetFolder.createFile(filename, content, MimeType.PLAIN_TEXT);
    }
  }
}