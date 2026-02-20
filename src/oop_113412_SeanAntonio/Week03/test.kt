package oop_113412_SeanAntonio.Week03

open class Karyawan {
    private var nama: String? = "belum ada"
    private var gaji: Int = 0
    protected var namaPacar: String = "jones"

    public fun set_nama(namakamu: String) {
        if (namakamu.length == 0) {
            println("nama tidak boleh kosong")
        } else {
            this.nama = namakamu
        }
    }

    public fun get_nama(): String {
        return this.nama + " oke"
    }

    public fun set_Gaji(gajikamu: Int) {
        if (gajikamu < 0) {
            println("masa gaji kamu minus")
        } else {
            this.gaji = gajikamu
        }
    }

    public fun get_gaji(): String {
       return this.gaji.toString()
    }
}

class DataPribadi: Karyawan() {
    public var umur: Int = 0
        set (value) {
            if (value < 0) {
                println("masa umur mines");
            } else {
                field = value;
            }
        }
    get(){
        return field
    }

    public fun ambil_data_pacar():String {
        return this.namaPacar;

    }
}

fun main() {
    var dp = DataPribadi()
    println("Nama Pacar : "+dp.ambil_data_pacar());

    dp.umur = 10;
    println("Nama Karyawan : "+dp.get_nama()+ " umur : " + dp.umur);
}
//  var kry = Karyawan()
//    kry.set_nama("UCOK")
//    kry.set_Gaji(-2)
//    kry.ambil_data_pacar
//
//    println("Hai " + kry.get_nama() + " gaji kamu = " + kry.g`et_gaji())
//}