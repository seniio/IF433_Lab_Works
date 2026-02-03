package oop_113412_SeanAntonio.week01

fun main() {
    val judul = "Elden Ring"
    val harga = 599000
    val userNote: String? = null

    val hargaAkhir = calculateDiscount(harga)

    printReceipt(
        title = judul,
        originalPrice = harga,
        finalPrice = hargaAkhir,
        note = userNote
    )
}

fun calculateDiscount(harga: Int): Int =
    if (harga > 500_000)
        harga - (harga * 20 / 100)
    else
        harga - (harga * 10 / 100)

fun printReceipt(
    title: String,
    originalPrice: Int,
    finalPrice: Int,
    note: String?
) {
    println("Judul Game: $title")
    println("Harga Asli: Rp $originalPrice")
    println("Harga Akhir: Rp $finalPrice")
    println("Catatan: ${note ?: "Tidak ada catatan"}")
}
