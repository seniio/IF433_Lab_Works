package oop_113412_SeanAntonio.Week12

fun pembagian(){
    try{
        val a= 10
        val b =2
        val hasil = a/b
        println("Hasil bagi adalah ${hasil}")
    } catch (e: Exception) {
        println("Ada error " + e.message)
    } finally{
        println("Selesai try catch")
    }
}

fun cek_tipe_variabel(){
    var angka: Int = try {
        Integer.parseInt("123")
    } catch (e:Exception){
        println("ada error ${e.message}")
        -77
    }
    println(angka)
}

fun cek_nilai(nilai:Int){
    if(nilai<0){
        throw IllegalArgumentException("Masa nilai minus")
    } else{
        println("Nilai kamu adalah" + nilai)
    }
}

class cek_saldo_rekening(val pengeluaran: Int, val saldo: Int):
    Exception("Saldo kamu sisa $saldo, ga cukup buat belanja $pengeluaran")

class transaksi_keuangan(val totalBelanja:Int){
    fun narik_uang(balance: Int){
        if(totalBelanja > balance){
            throw cek_saldo_rekening(totalBelanja, balance)
        } else {
            println("Transaksi Berhasil, sisa saldo ${balance - totalBelanja}")
        }
    }

}

fun main(){
    pembagian()

    cek_tipe_variabel()
    try {
        cek_nilai(-10)
    } catch(e: Exception){
        println("Ada error di nilai: "+ e.message)
    }

    val trx = transaksi_keuangan(1200)
    trx.narik_uang(1200)

}