package oop_113412_SeanAntonio.Week06.Practice

interface Siswa {
    val namaSiswa: String
    fun belajar()
    fun mandi()
    fun mainGame(){
        println("$namaSiswa main game juga")
    }
}