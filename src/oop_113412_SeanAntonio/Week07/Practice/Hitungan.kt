package oop_113412_SeanAntonio.Week07.Practice

class Hitungan private constructor(val tipe: String) {
        init {
            println("isi param class: ${tipe}")
        }

    companion object {
        const val namaMtk: String = "Matematika"
        fun tambah(a: Int, b: Int){
            println("hasil penambahan: $a+$b " +(a+b))
        }
        fun kali (a: Int, b: Int){
            println("hasil perkalian: $a x $b = " + (a*b))
        }
        fun buat_data(tipeUser: String) {
            Hitungan(tipeUser);
            }
        }
    }