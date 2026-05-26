package oop_113412_SeanAntonio.Week14

class proses_khs {
    fun hitung_nilai_tugas(quiz: Double, aktivitas:Double):Double {
        return (quiz * 0.3) + (aktivitas * 0.7)
    }
    fun hitung_nilai_akhir(uts: Double, uas: Double, tugas: Double):Double {
        return (uts * 0.3) + (uas * 0.4) + (tugas * 0.3)
    }
}

class db_khs{
    fun simpan_na_db(nim: String, nama: String, nilaiAkhir: Double) :String {
        return "KHS $nim nama $nama dapat nilai $nilaiAkhir"
        }
    fun load_db (nim: String): String {
        return "berhasil load data $nim"
    }
}


fun main () {
    val khsMhs = proses_khs()
    val nilaiTugas: Double = khsMhs.hitung_nilai_tugas(84.59, 90.99)
    val naMhs: Double = khsMhs.hitung_nilai_akhir(88.77, 89.03, nilaiTugas)

    val dbMhs = db_khs()
    val statSimpan: String = dbMhs.simpan_na_db("113412", "Sean", naMhs)
    println(statSimpan)
}