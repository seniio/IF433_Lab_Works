package oop_113412_SeanAntonio.Week08

fun main () {
    println("=== TEST SAFE CALLS & ELVIS ===")
    val emptyOrder = Order(null, null)

    val destination = emptyOrder.deliveryDetails?.address?.city?.name ?: "Kota tidak diketahui"
    println("Tujuan pengiriman: $destination")

    println("\n=== TEST LET BLOK ===")
    val validOrder = Order(null, 250000)

    val receipt = validOrder.totalPrice?.let { price ->
        val tax = price * 0.11
        "Transaksi valid. Harga : Rp$price, Pajak: Rp$tax"
    } ?: "transaksi invalid. Harga belum di set!"
    println(receipt)

    println("\n=== TEST SAFE CASTING ===")
    val mixedData: List<Any> = listOf(
        "Smartphone", 1500000, UserProfile("Andi", null), "Laptop", 4500000.0
    )

    for (item in mixedData) {
        val text = item as? String
        text?.let {
            println("Ditemukan teks: ${it.uppercase()}")
        }
    }

    val someObject: Any = 100
    val safeString = someObject as? String ?: "Unknown String"
    println("Hasil cast fallback: $safeString")

    println("\n=== TEST THE RED BUTTON (!!) ===")
    val toxicData: String? = null
    try {
        val length = toxicData!!.length
    } catch (e: NullPointerException) {
        println("CRASH (NPE)! Jangan gunakan !! secara sembarangan.")
    }

    val apiResponse: Map<String, String?> = mapOf("status" to "200", "token" to null)
    try {
        val token = requireNotNull(apiResponse["token"]) { "CRITICAL EXCEPTION: Token otentikasi tidak ditemukan!!" }
    } catch (e: IllegalArgumentException) {
        println(e.message)
    }

    val apiResponse: Map<String, String?> = mapOf("status" to "200", "token" to null)
    try {
        val token = requireNotNull(apiResponse["token"]) { "CRITICAL EXCEPTION: Token otentikasi tidak ditemukan!" }
    } catch (e: IllegalArgumentException) {
        println(e.message)
    }

    println("\n=== TEST JAVA INTEROP ===")
    val javaResponse = LegacyJavaAPI.fetchServerStatus()
    val statusLength = javaResponse!!.length
    println("Status dari Java: $javaResponse (Length: $statusLength)")

}