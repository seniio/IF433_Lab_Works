package oop_113412_SeanAntonio.Week08.Lecture

fun main(){
    var nama: String? = "sean";
    try{
        println("halo ${nama}")
        println("panjang huruf ${nama!!.length}")
    }catch (e: Exception){
        println("ada error exception, ini pesan errornya ${e.message}")
    }

    val mixedData: List<Any> = listOf(1, "Budi", 10, "Online")
    for (item in mixedData){
        val hasil = item as? String
        if (hasil != null) {
            println(hasil)
        }
    }
}