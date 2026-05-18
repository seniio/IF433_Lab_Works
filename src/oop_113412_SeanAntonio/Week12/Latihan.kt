package oop_113412_SeanAntonio.Week12

fun pembagian(){
    try{
        val a = 10
        val b = 2
        val hasil = a / b
        println("Hasil bagi adalah $hasil")
    } catch (e: Exception){
        println("Ada error " + e.message)
    } finally{
        println("Selesai try catch")
    }
}

fun cek_tipe_variabel(){
    var angka: Int = try{
        Integer.parseInt("123")
    } catch (e: Exception){
        println("ada error ${e.message}")
        -77
    }

    println(angka)
}

fun cek_nilai(nilai:Int){
    if(nilai < 0){
        throw IllegalArgumentException("Masa nilai minus")
    } else if(nilai > 100){
        throw IllegalArgumentException("Nilai tidak boleh lebih dari 100")
    } else{
        println("Nilai kamu adalah $nilai")
    }
}

class cek_saldo_rekening(
    val pengeluaran:Int,
    val saldo:Int
): Exception("Saldo kamu sisa $saldo, ga cukup buat belanja $pengeluaran")

class transaksi_keuangan(val totalbelanja:Int){

    fun narik_uang(balance:Int){
        if(totalbelanja > balance){
            throw cek_saldo_rekening(totalbelanja, balance)
        } else{
            println("Transaksi berhasil, sisa saldo ${balance - totalbelanja}")
        }
    }

}

fun multiple_catch(input:String){
    try{
        val angka = input.toInt()
        val hasil = angka / 0

        println("Hasil bagi $hasil")

    } catch (e:NumberFormatException){

        println("Input harus angka ${e.message}")

    } catch (e:ArithmeticException){

        println("Ga bisa dibagi 0 ${e.message}")

    } catch (e:Exception){

        println("Ada error ${e.message}")

    }
}

sealed class bank_exception(pesan:String):
    Exception("Error bank exception $pesan")

class cek_saldo(val pengeluaran:Int):
    bank_exception("Belanja $pengeluaran lebih besar dari saldo")

class cek_input(val transaksi:Int):
    bank_exception("Transaksi ga boleh minus $transaksi")

fun transaksi_belanja(
    saldo_kamu:Int,
    jajan_kamu:Int
): Int{

    if(jajan_kamu < 0){

        throw cek_input(jajan_kamu)

    } else if(jajan_kamu > saldo_kamu){

        throw cek_saldo(jajan_kamu)

    }

    return saldo_kamu - jajan_kamu
}

fun main(){

    pembagian()

    cek_tipe_variabel()

    try{
        cek_nilai(110)
    } catch (e: Exception){
        println("Ada error di nilai: " + e.message)
    }

    val trx = transaksi_keuangan(1000)

    try{
        trx.narik_uang(1200)
    } catch (e: Exception){
        println(e.message)
    }

    multiple_catch("123")

    runCatching {

        transaksi_belanja(1000, 1200)

    }.onSuccess {

        println("Belanja berhasil, sisa saldo $it")

    }.onFailure {

        println(it.message)

    }

}