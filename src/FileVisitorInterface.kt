package folderTest

interface FileVisitorInterface {
    fun prettyPrint(folder: Folder)
    fun prettyPrint(file: File)
}