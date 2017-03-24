# FileUtils functionality
Audios+
Videos+
Folders with Audio+
Folders with Video+

##Gradle

```groovy
repositories{
    maven { url 'https://jitpack.io' }
}

dependencies{
    compile 'com.github.iamvaliyev:FileUtils:0.0.1'
}
```
## How to use?
    FileUtils.getAllAudioFiles(context); //Get Audios
    FileUtils.getAllVideoFiles(context); //Get Videos
    FileUtils.getAllAudioFoldersAndFile(context); //Get Audio Folders
    FileUtils.getAllVideoFoldersAndFiles(context); //Get Video Folders
