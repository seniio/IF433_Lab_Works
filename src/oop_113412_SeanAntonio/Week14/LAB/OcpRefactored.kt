package oop_113412_SeanAntonio.Week14.LAB

interface DiscountStrategy {
    fun apply(price: Double): Double
}

class StudentDiscount : DiscountStrategy {
    override fun apply(price: Double): Double = price * 0.80
}

class MemberDiscount : DiscountStrategy {
    override fun apply(price: Double): Double = price * 0.85
}

class SafeDiscountCalculator(private val strategy: DiscountStrategy) {
    fun calculate(price: Double): Double {
        return strategy.apply(price)
    }
}