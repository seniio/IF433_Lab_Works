package oop_113412_SeanAntonio.Week6.Practice

class KRS(override val nama: String, override val namaSiswa: String): Mahasiswa, Siswa {
    override fun belajar() {
        println("si $nama sedang belajar")
        println("Siswa $namaSiswa sedang belajar juga")
    }
    override fun makan() {
        println("$nama makan")
    }

    override fun mandi() {
        println("$nama mandi")
    }
    override fun mainGame() {
        super<Siswa>.mainGame()
    }
}