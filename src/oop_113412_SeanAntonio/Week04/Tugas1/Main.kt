package oop_113412_SeanAntonio.Week04.Tugas1

fun main() {
    println("--- Testing Vehicle ---")
    val generalVehicle = Vehicle("Sepeda Onthel")
    generalVehicle.accelerate()
    generalVehicle.honk()

    println("\n--- Testing Car ---")
    val myCar = Car("Toyota", 4)
    myCar.openTrunk()
    myCar.honk()
    myCar.accelerate()

    println("\n--- Testing Electric Car ---")
    val electricCar = ElectricCar("BYD",2,90)
    electricCar.accelerate()
    electricCar.honk()
    electricCar.openTrunk()

}