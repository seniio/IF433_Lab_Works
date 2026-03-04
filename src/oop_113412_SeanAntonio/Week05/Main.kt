package oop_113412_SeanAntonio.Week05

fun main() {

    val eWallet = EWallet("Sean E-Wallet", 50000.0)
    val creditCard = CreditCard("Sean Credit Card", 100000.0)

    val paymentMethods: List<PaymentMethod> = listOf(eWallet, creditCard)

    for (method in paymentMethods) {

        println("\nMemproses pembayaran 75000.0 untuk ${method.accountName}")
        method.processPayment(75000.0)

        if (method is EWallet) {
            println("Saldo tidak cukup, melakukan top up...")
            method.topUp(50000.0)
            println("Mencoba transaksi ulang...")
            method.processPayment(75000.0)
        }
    }
}