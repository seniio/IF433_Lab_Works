package oop_113412_SeanAntonio.Week05.Tugas1

fun main() {

    val mathHelper = MathHelper()

    val luasPersegi = mathHelper.hitungLuas(4)
    val luasPersegiPanjang = mathHelper.hitungLuas(5, 3)
    val luasLingkaran = mathHelper.hitungLuas(7.0)

    println("Luas Persegi: $luasPersegi")
    println("Luas Persegi Panjang: $luasPersegiPanjang")
    println("Luas Lingkaran: $luasLingkaran")
}