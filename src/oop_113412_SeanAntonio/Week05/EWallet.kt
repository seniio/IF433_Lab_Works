package oop_113412_SeanAntonio.Week05

class EWallet(
    accountName: String,
    var balance: Double
) : PaymentMethod(accountName) {

    override fun processPayment(amount: Double) {
        if (balance >= amount) {
            balance -= amount
            println("EWallet - Transaksi berhasil. Sisa saldo: $balance")
        } else {
            println("EWallet - Saldo tidak cukup.")
        }
    }

    fun topUp(amount: Double) {
        balance += amount
        println("EWallet - Top up berhasil. Saldo sekarang: $balance")
    }
}