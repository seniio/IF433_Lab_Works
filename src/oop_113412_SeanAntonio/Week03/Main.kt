package oop_113412_SeanAntonio.Week03

fun main() {
    val w = Weapon("Excalibur")

    w.damage = -50
    w.damage = 9999

    println("Weapon: ${w.name}")
    println("Damage: ${w.damage}")
    println("Tier: ${w.tier}")
}