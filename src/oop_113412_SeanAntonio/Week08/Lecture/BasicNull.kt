package oop_113412_SeanAntonio.Week08.Lecture

class profile_page(val idprofile: String?, val statusOnLine: String?){
fun ganti_foto(filePhoto:String?){
    println("foto kamu ${filePhoto}")
}}

fun main() {
    var nama: String? = "Sean";
    nama = null;
    println("nama kamu $nama");

    val profile = profile_page("12345", null);
    println("id ${profile.idprofile} status: ${profile.statusOnLine}");

    profile.ganti_foto("fotosaya.jpg")
}
