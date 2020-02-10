package folderTest

class FileVisitor : FileVisitorInterface {
    override fun prettyPrint(folder: Folder) {
        println("$folder")
    }

    override fun prettyPrint(file: File) {
        println("$file")
    }

}