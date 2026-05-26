package oop_113412_SeanAntonio.Week13.Kelas
import java.io.File
import java.io.BufferedReader
import java.io.FileReader

data class siswa (val nama: String, val umur: Int, val ipk: Double)
fun siswa.toCSV(): String = "$nama, $umur, $ipk"

fun main () {
    val murid = siswa("Sean", 20, 3.5)
    //println (murid.toCSV())

    val dataSiswa = listOf(
        siswa("udin", 20, 3.6),
        siswa("Linda", 20, 3.8),
        siswa("anto", 20, 3.7),
        siswa("tonio", 20, 3.9)
    )
    val data = dataSiswa.joinToString(separator = "\n")
    println(data)

    val fileBuat2 = File("src/oop_113412_SeanAntonio/Week13/Kelas/fileBuat.csv")
    fileBuat2.writeText(data)

    println ("\n========= BACA FILE =========")
    //cara 1
    println("==== CARA 1 ====")
    val filesaya = File ("src/oop_113412_SeanAntonio/Week13/Kelas/contohfile.txt")
    var bacaFile = filesaya.readText()
    println (bacaFile)

    //cara 2
    println("\n==== CARA 2 ====")
    var fileKamu = File("src/oop_113412_SeanAntonio/Week13/Kelas/contohfile.txt")
    val bacaFile2 = filesaya.readLines()
    bacaFile2.forEach (){
        println("Ke2 ::::: " + it)
    }

    //cara 3
    println("\n==== CARA 3 ====")
    val br = BufferedReader(FileReader("src/oop_113412_SeanAntonio/Week13/Kelas/contohfile.txt"))
    var baris: String? = br.readLine()
    while (baris != null) {
        println(baris)
        baris = br.readLine()
    }
    br.close()

    //cara 4
    println("\n==== CARA 4 ====")
    val br2 = BufferedReader(FileReader("src/oop_113412_SeanAntonio/Week13/Kelas/contohfile.txt"))
    br2.use { baris ->
        baris.lineSequence()
            .filter { it.isNotEmpty() }
            .forEach { println(it) }
    }

    println ("========= BUAT FILE =========")
    val fileBuat = File("src/oop_113412_SeanAntonio/Week13/Kelas/fileBuatan.txt")
    println("==== CARA 1 ====")
    fileBuat.writeText("Ini adalah baris pertama \nini keDuaa")

    fileBuat.appendText("\nIni baris ketiga")

    val contohList = listOf("Nasi goreng", "bakpao", "siomay")
    fileBuat.appendText("\n" + contohList.joinToString("\n"))

    println("\n==== CARA 2 ====")
    fileBuat.printWriter().use{
        out ->
        out.println("Ini contoh baris pertama pakai printwritter, 20, 40, 8")
        out.println("Ini contoh baris kedua pakai printwritter, 23, 46, 2")
    }
}
