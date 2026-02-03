package oop_113412_SeanAntonio.week01

fun main() {
    val judul = "Elden Ring"
    val harga = 599000

    val hargaAkhir = calculateDiscount(harga)

    println("Judul Game: $judul")
    println("Harga Asli: Rp $harga")
    println("Harga Akhir: Rp $hargaAkhir")
}

fun calculateDiscount(harga: Int): Int =
    if (harga > 500_000)
        harga - (harga * 20 / 100)
    else
        harga - (harga * 10 / 100)
