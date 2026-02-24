package oop_113412_SeanAntonio.Week04.Practice

open class Car(brand:String, val numberofDoors: Int) : Vehicle(brand) {
    fun openTrunk(){
        println("Bagasi mobil $brand dengan $numberofDoors pintu dibuka.")
    }

    override fun honk() {
        println("TIN TIN! Mobil $brand mau lewat!")
    }

    override fun accelerate() {
        super.accelerate()
        println("Mobil $brand menggunakan transmisi gigi untuk menambah kecepatan")
    }
}