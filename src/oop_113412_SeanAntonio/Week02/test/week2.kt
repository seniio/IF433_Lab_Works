package oop_113412_SeanAntonio.Week02.test

class myCar {
    public var warna: String = "abu";
    public var kecepatan: Int = 50;

    init {
        if (this.kecepatan >= 70) {
            println("cepet banget")
        } else {
            println("pelan banget")
        }
    }

    constructor(speed: Int=0, brake: Double=1.3) {
        this.kecepatan = speed;
        println("ini dari si secondary constructor $kecepatan dan $brake");
    }

    fun mulai_jalan(){
        println("kecepatan $warna nya luar biasa")
    }
}


fun main (){
    val myCar = myCar(100  , 5.4);
    myCar.mulai_jalan();
    myCar.warna = "merah";

    println ("Warna mobil ${myCar.warna}");
}