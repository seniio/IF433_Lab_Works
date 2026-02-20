package oop_113412_SeanAntonio.Week03

fun Main() {
    val e = Employee("sean")
    e.salary = -1000
    e.salary = 500000
    println("Gaji: ${e.salary}")
    e.increasePerfomance()

    println("Pajak yang harus dibayar: ${e.tax}")
}