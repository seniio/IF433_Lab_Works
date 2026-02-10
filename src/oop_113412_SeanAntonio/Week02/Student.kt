package oop_113412_SeanAntonio.Week02

class Student (val name: String, val nim: String, val major: String) {

    constructor(name: String, nim: String) : this(name, nim, "Non-Matriculated") {
        println("LOG : menggunakan constructor jalur umum (Tanpa Jurusan).")
    }

    init {
        if (nim.length != 5){
            println ("WARNING: Objek tercipta dengan nim ($nim) yang tidak valid!")
            print("Data mahasiswa $name mungkin akan bermasalah di sistem.")
        } else {
            println("LOG: Objek Student $name berhasil dialokasikan di memory.")
        }
    }
}