package folderTest

interface FileStructure {
    fun accept(visitor: FileVisitor)
}