package oop_113412_SeanAntonio.Week10

class nonGeneric(var hasil: Any)

class generic <T>(var hasil: T)

class Kota<T, V>(var kodepos:T, var telp:V)

fun <T> cobaFungsi(angka: T):T{
    return angka;
}

fun<T: Number> tambah(angka:T):Double{
    return angka.toDouble() + 50;
}
fun<T: Number> kurang(angka:T):Double{
    return angka.toDouble() - 50;
}

class kalkulator<T: Number> (val a:T, val b:T){
    fun kali(): Double{
        return a.toDouble() * b.toDouble()
    }
    fun bagi():Int{
        return a.toInt() / b.toInt()
    }
}

fun <T> nilaiKKM(list: List<T>, kkm:T): List<T> where T: Comparable<T>{
    return list.filter {it>= kkm}
}

fun main() {
    println("=== NON_GENERIC ===")
    val nGen = nonGeneric(100)
    val angkaGen = nGen.hasil as Int
    println(angkaGen + 50)

    println("\n=== GENERIC ===")
    val gen = generic(200)
    println(gen.hasil + 50)

    println("\n=== GENERIC 2 PARAMETER ===")
    val city = Kota("12345", 880123)
    println("Kodepos kamu" + city.kodepos)
    println("telp kamu ${city.telp}")

    println("\n=== GENERIC FUNGSION ===")
    println("Hasil: " + cobaFungsi(10))

    println("\n==== GENERIC CONSTRAINT ===")
    println("Hasil tambah: ${tambah(100.5)}")
    println("Hasil kurang: ${kurang(100.5)}")

    println("\n=== GENERIC FUNGTION IN CLASS ===")
    val kalk = kalkulator(10.2, 3.5)
    println("Hasil kali: ${kalk.kali()}")
    println("Hasil bagi: ${kalk.bagi()}")

    println("\n=== GENERIC WHERE===")
    val nilaiMhs = listOf(80, 90, 43, 83, 90, 87, 40, 61, 50)
    val nilaiFilterKKM = nilaiKKM(nilaiMhs, 75)
    println("nilai awal: " + nilaiMhs)
    println("setelah filter: " + nilaiFilterKKM)
}