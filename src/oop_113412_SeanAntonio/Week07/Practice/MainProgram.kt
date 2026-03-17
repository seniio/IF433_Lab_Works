package oop_113412_SeanAntonio.Week07.Practice

fun main() {
    Koneksi.kon = "localhost:1313";
    println("Link ${Koneksi.kon}");
    Koneksi.coba_konek_db()

    Hitungan.tambah(10,20)
    Hitungan.kali(7,20)
    println("Nama matkul: ${Hitungan.namaMtk}");

    Hitungan.buat_data("User biasa")

    val dt = SaveData ("Mario",
        10, 100,
        5);
    println("namaChar : ${dt.namaChar}");
    println(dt)

    val dtcopy = dt.copy("Luigi");
    println{"Nama : ${dtcopy.namaChar}"}
    println(dtcopy);

    println("==== class ENUM ====")
    val arh = Arah.Atas;
    println(arh.tampilkan_isi_param())

    println("---- SEALED CLASS ----")
    val hsl: Hasil = Hasil.sukses("Berhasil  simpan");
    hsl.handle_response(hsl);


}