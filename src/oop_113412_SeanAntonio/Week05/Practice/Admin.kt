package oop_113412_SeanAntonio.Week05.Practice

class Admin(nama: String)  : Pegawai (nama) {
    override fun bekerja() {
        println("[$nama] sedang duduk di depan komputer melayani administrasi.")
    }
    fun doAdminWork(){
        println("[$nama] sedang merekap data absensi mahasiswa di kelas.")
    }
}