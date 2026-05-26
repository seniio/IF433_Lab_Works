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

class manager_hitung_khs{
    fun mulai_perhitungan(quizTugas: Double, aktivitasTugas: Double, utsKamu: Double, uasKamu: Double, jenisKurikulum: jenis_kurikulum): Double {
        val khsMhs = proses_khs()
        val nilaiTugas: Double = khsMhs.hitung_nilai_tugas(quizTugas, aktivitasTugas)

        val NilaiAkhirMhs: Double = khsMhs.hitung_nilai_akhir(utsKamu, uasKamu, nilaiTugas, jenisKurikulum)
        return NilaiAkhirMhs
    }
}

class manager_db {
    fun mulai_simpan (nimMhs: String, namaMhs: String, naMhs: Double):String {
        val dbMhs = db_khs()
        return dbMhs.simpan_na_db(nimMhs, namaMhs, naMhs)
    }
}

fun main() {
    val mngKhs = manager_hitung_khs()
    val naMhs1 = mngKhs.mulai_perhitungan(85.88, 89.88, 80.99, 90.20, kurikulum_2013())
    val naMhs2: Double = mngKhs.mulai_perhitungan(85.88, 89.88, 80.99, 90.20, kurikulum_merdeka())

    val manager_db = manager_db()
    println (manager_db.mulai_simpan("113412", "Sean", naMhs1))
    println (manager_db.mulai_simpan("113422", "Anto", naMhs2))
}