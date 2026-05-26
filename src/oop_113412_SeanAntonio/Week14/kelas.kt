package oop_113412_SeanAntonio.Week14

class proses_khs {
    fun hitung_nilai_tugas(quiz: Double, aktivitas:Double):Double {
        return (quiz * 0.3) + (aktivitas * 0.7)
    }

    fun hitung_nilai_akhir(utsMhs: Double, uasMhs: Double, tugasMhs: Double, jenisKurikulum: jenis_kurikulum): Double {
        return jenisKurikulum.hitung_bobot_nilai(utsMhs, uasMhs, tugasMhs)
    }
}

interface jenis_kurikulum {
    fun hitung_bobot_nilai(uts: Double, uas: Double, tugas: Double): Double
}

class kurikulum_2013 : jenis_kurikulum {
    override fun hitung_bobot_nilai(uts: Double, uas: Double, tugas: Double): Double {
        return (uts * 0.3) + (uas * 0.4) + (tugas * 0.3)
    }
}

class kurikulum_merdeka : jenis_kurikulum {
    override fun hitung_bobot_nilai(uts: Double, uas: Double, tugas: Double): Double {
        return (uts * 0.2) + (uas * 0.3) + (tugas * 0.5)
    }
}

class db_khs {
    fun simpan_na_db(nim: String, nama: String, nilaiAkhir: Double): String {
        return "KHS $nim nama $nama dapat nilai $nilaiAkhir"
    }
    fun load_db(nim: String): String {
        return "berhasil load data $nim"
    }
}

fun main() {
    val khsMhs = proses_khs()
    val nilaiTugas: Double = khsMhs.hitung_nilai_tugas(84.59, 90.99)

    val naMhs1: Double = khsMhs.hitung_nilai_akhir(90.0, 80.40, nilaiTugas, kurikulum_merdeka())
    val naMhs2: Double = khsMhs.hitung_nilai_akhir(94.5, 80.05, nilaiTugas, kurikulum_2013())

    val dbMhs = db_khs()
    val statSimpan1: String = dbMhs.simpan_na_db("111345", "aLice", naMhs1)
    val statSimpan2: String = dbMhs.simpan_na_db("113412", "Sean", naMhs2)

    println(statSimpan1)
    println(statSimpan2)
}