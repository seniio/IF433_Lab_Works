package oop_113412_SeanAntonio.Week11

fun String.DasarExtension(): String {
    return "Halo $this"
}

fun String.UbahHurufBesarDepan(): String {
    var hasil = "";
    hasil = this.split(" ").joinToString(" "){
        it.replaceFirstChar { c -> c.uppercaseChar()
        }
    };
    return hasil;
}

fun String.TentukanLulusan(nilai: Int): String {
    var hasil = "";
    if (nilai>78){
        hasil = "Lulus"
    } else{
        hasil = "Remedial"
    }
    return this + "" + hasil;
}

fun String?.CekNulldanEmpty(): String {
    var hasil=""
    if(this==null || this.isEmpty()){
        hasil = "ga boleh null atau kosong"
    } else{
        hasil = "Password kamu : $this"
    }
    return hasil
}

data class Manusia (var nama:String, var umur:Int)


fun main () {

    var passwordkamu: String? = null
    println(passwordkamu.CekNulldanEmpty())

    println("sean antonio".DasarExtension())

    val nama1 = "Budi123"
    println(nama1.uppercase())

    val nama2 = "sean antonio"
    println(nama2.UbahHurufBesarDepan())

    println("Grade kamu: ".TentukanLulusan(71))

    println("ya".repeat(5))

    val huruf: String = "UMN"
    val hasilKampus = huruf.let {
        if ( it == "UMN"){
            println("Kampus saya")
        }else {
            println("Bukan kampus saya")
        }
    }
    println(hasilKampus)

    var nilaiKamu = 70.run{
        if(this >= 70){
            println("lulus")
        }else {
            println("gagal")
        }
        println(this)
    }

    val pekerjaan = with("Mahasiswa"){
        if (this == "Mahasiswa"){
            println("Pelajar")
        } else {
            println("Pekerja")
        }
    }

    val orang = Manusia("budi",25).apply {
        umur = 29
    }
    println("Nama kamu : ${orang.nama} \nUmur kamu : ${orang.umur}")

    var deretAngka = mutableListOf<Int>(1,2,3,4)
    deretAngka.also{
        println("Sebelum $deretAngka")
    } .add(5)
    print("Setelah $deretAngka")
}
