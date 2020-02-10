package folderTest

class File(
    private val name: String,
    private val folder: Folder
) : FileStructure {
    private var tabs: Int = 0

    override fun toString(): String {
        return "$tabs " + folder +  " : " + name
    }

    override fun accept(visitor: FileVisitor) {
        visitor.prettyPrint(this)
    }
}