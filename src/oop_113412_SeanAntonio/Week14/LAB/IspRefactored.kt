package oop_113412_SeanAntonio.Week14.LAB

interface Printable {
    fun print(doc: String)
}

interface Scannable {
    fun scan(doc: String): String
}

class ModernSimplePrinter : Printable {
    override fun print(doc: String) {
        println("Printing securely: $doc")
    }
}