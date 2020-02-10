package folderTest

fun main() {
    val structure: MutableList<FileStructure> = mutableListOf()
    val visitor = FileVisitor()


    val root = Folder("Root")
    val fil1 = File("Fil 1", root)
    val fil2 = File("Fil 2", root)

    val folder = Folder("Folder")
    val fil3 = File("Fil 3", folder)
    val fil4 = File("Fil 4", folder)

    val folder2 = Folder("Folder 2")
    val fil5 = File("Fil 5", folder2)
    val fil6 = File("Fil 6", folder2)

    structure.add(root)
    structure.add(fil1)
    structure.add(fil2)
    structure.add(folder)
    structure.add(fil3)
    structure.add(fil4)
    structure.add(folder2)
    structure.add(fil5)
    structure.add(fil6)

    structure.forEach { it.accept(visitor) }
}