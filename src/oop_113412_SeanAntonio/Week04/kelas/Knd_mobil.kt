package oop_113412_SeanAntonio.Week04.kelas

class Knd_mobil: Kendaraan() {
    private var jmlBan:Int = 0;

    init{
        jmlBan = 4;
        println("mobil punya $jmlBan ban");
    }

    override fun jalan_maju() {
        println("MOBIL MAJUUU");
    }
}