package oop_113412_SeanAntonio.Week14.LAB

import java.io.File

interface OrderRepository {
    fun saveOrder(itemName: String, finalPrice: Double, customerType: String)
}

class CsvOrderRepository : OrderRepository {
    override fun saveOrder(itemName: String, finalPrice: Double, customerType: String) {
        val file = File("orders.csv")
        file.bufferedWriter().use {
            file.appendText("$itemName, $finalPrice, $customerType\n")
        }
    }
}

interface NotificationService {
    fun sendNotification(itemName: String)
}

class EmailNotifier : NotificationService {
    override fun sendNotification(itemName: String) {
        println("Email terkirim: Pesanan $itemName Anda telah dikonfirmasi!")
    }
}

interface PricingStrategy {
    val customerType: String
    fun calculate(price: Double): Double
}

class RegularPricing : PricingStrategy {
    override val customerType: String = "REGULAR"
    override fun calculate(price: Double): Double = price
}

class VipPricing : PricingStrategy {
    override val customerType: String = "VIP"
    override fun calculate(price: Double): Double = price * 0.90
}

class SafeOrderProcessor(
    private val repo: OrderRepository,
    private val notifier: NotificationService
) {
    fun processOrder(itemName: String, basePrice: Double, strategy: PricingStrategy) {
        val finalPrice = strategy.calculate(basePrice)
        println("Memproses pesanan $itemName seharga $finalPrice")

        repo.saveOrder(itemName, finalPrice, strategy.customerType)
        notifier.sendNotification(itemName)
    }
}