package oop_113412_SeanAntonio.Week04

fun main() {

    println("--- Testing Employee Hierarchy ---")

    val manager = Manager("Anto", 10000000)
    val developer = Developer("Sean", 8000000, "Kotlin")

    println("\nManager:")
    manager.work()
    println("Bonus Manager: Rp ${manager.calculateBonus()}")

    println("\nDeveloper:")
    developer.work()
    println("Bonus Developer: Rp ${developer.calculateBonus()}")
}