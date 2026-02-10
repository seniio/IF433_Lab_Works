package oop_113412_SeanAntonio.Week02.RPGbattle

import java.util.Scanner
import kotlin.random.Random

fun main() {
    val scanner = Scanner(System.`in`)

    print("Nama Hero: ")
    val heroName = scanner.nextLine()

    print("Base Damage Hero: ")
    val baseDamage = scanner.nextInt()

    val hero = Hero(heroName, baseDamage = baseDamage)
    var enemyHp = 100

    while (hero.isAlive() && enemyHp > 0) {
        println("\nMenu:")
        println("1. Serang")
        println("2. Kabur")
        print("Pilih aksi: ")
        val choice = scanner.nextInt()

        if (choice == 1) {
            hero.attack("Musuh")

            enemyHp -= hero.baseDamage
            if (enemyHp < 0) enemyHp = 0
            println("HP Musuh tersisa: $enemyHp")

            if (enemyHp > 0) {
                val enemyDamage = Random.nextInt(10, 21)
                hero.takeDamage(enemyDamage)
                println("Musuh menyerang balik! Damage: $enemyDamage")
                println("HP Hero tersisa: ${hero.hp}")
            }
        } else if (choice == 2) {
            println("Hero kabur dari pertarungan.")
            break
        }
    }

    println("\nHasil Pertarungan:")
    if (hero.isAlive() && enemyHp <= 0) {
        println("Hero menang!")
    } else if (!hero.isAlive()) {
        println("Hero kalah!")
    } else {
        println("Pertarungan berakhir tanpa pemenang.")
    }
}
