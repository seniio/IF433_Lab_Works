package oop_113412_SeanAntonio.Week05

abstract class PaymentMethod(val accountName: String) {

    abstract fun processPayment(amount: Double)
}