package oop_113412_SeanAntonio.Week02.library

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    print("Judul Buku: ")
    val title = scanner.nextLine()

    print("Nama Peminjam: ")
    val borrower = scanner.nextLine()

    print("Lama Pinjam (hari): ")
    var duration = scanner.nextInt()

    if (duration < 0) {
        duration = 1
    }

    val loan = Loan(title, borrower, duration)

    println("\nDetail Peminjaman")
    println("Judul Buku   : ${loan.bookTitle}")
    println("Peminjam    : ${loan.borrower}")
    println("Lama Pinjam : ${loan.loanDuration} hari")
    println("Total Denda : Rp ${loan.calculateFine()}")
}
