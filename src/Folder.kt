package folderTest

class Folder(
    private val name: String
) : FileStructure {

    override fun toString(): String {
        return name
    }

    override fun accept(visitor: FileVisitor) {
        visitor.prettyPrint(this)
    }
}