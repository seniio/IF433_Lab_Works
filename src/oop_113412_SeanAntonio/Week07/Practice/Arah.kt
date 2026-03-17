package oop_113412_SeanAntonio.Week07.Practice

enum class Arah (val petunjuk: String) {
    Atas("naik"),
    Bawah("turun"),
    Kiri("Belok"),
    Kanan("mengsong");

    fun tampilkan_isi_param(){
        println("arah ke $petunjuk")
    }
}