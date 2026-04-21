package oop_113412_SeanAntonio.Week09

fun main (){
    println("==== LIST OF ====")
    var arMhs = listOf("Budi","Susi","Titus")
    //view
    println(arMhs)
    //lihat panjang array
    println("Panjang list ${arMhs.size}")
    //ambil satuan data di listOf
    println(arMhs[1])
    //muncul semuanya
    for (a in arMhs) {
        println(a)
    }
    println("===== MUTABLE LIST =====")

    var arAngka = mutableListOf(10,30,40,20,90,100,15)

    //nambah angka
    arAngka.add(777)
    //ganti/replace array
    arAngka[2] = 123
    //hapus array
    arAngka.removeAt(3)

    println(arAngka)

    println("====== SET OF =====")
    var arUrutan = setOf(20,30,40,20,70,30,10,100)
    println(arUrutan.size)
    println(arUrutan)
    println("ada angka 40 ga?" + arUrutan.contains(40))

    println("===== MUTABLE SET OF =====")

    var arMakanan = mutableSetOf("Nasi","Mie","bakpao","ayam","ayam 2")
    arMakanan.add("ketoprak")
    arMakanan.add("Mie")
    println(arMakanan)
    arMakanan.remove("Nasi")
    println(arMakanan)

    println("===== MAP OF =====")
    var arSiswa = mapOf(
        "Andi" to 89,
        "Toni" to 73,
        "Ivander" to 90
    )
    println("Banyak data siswa: " + arSiswa.size)
    println("Nilai si Andi: " + arSiswa["Andi"])
    println("Semua keys: " + arSiswa.keys)
    println("Semua values: " + arSiswa.values)
    println("Nama siswa index 1: " + arSiswa.keys.elementAt(1) )
    println(arSiswa)

    println("===== Mutable Map =====")

    var arMenu = mutableMapOf(
        "nasi" to 1000,
        "Ayam" to 2000,
        "Sayur asem" to 1500
    )
    println("Banyak menu: " +arMenu.size)
    arMenu["nasi"] = 500
    arMenu.remove("Ayam")
    arMenu.put("Udang", 2300)
    println(arMenu)

    println("========== LAMBDA =========")
    //fun biasa
    fun tambah(a: Int, b: Int): Int {
        return a+b
    }
    //fun lambda
    var kurang = {a: Int, b: Int -> a-b}
    println("kurang-kurangan: ${kurang(5,3)}")

    println("========== IMPLICIT IT =========")
    var pangkat = {x: Int -> x*x}
    var hitungPangkat:(Int) -> Int = {it * it}
    println("Pangkat " + hitungPangkat(5))

    //tampilin semua hasil pakai looping
    arSiswa.forEach { siswa -> println(siswa) }
    for(sis in arSiswa) {
        println(sis)
    }
}
