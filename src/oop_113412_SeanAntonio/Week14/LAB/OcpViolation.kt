package oop_113412_SeanAntonio.Week14.LAB

class DiscountCalculator {
    fun calculate(price: Double, type: String): Double {
        return when (type) {
            "student" -> price * 0.80
            "member" -> price * 0.85
            "employee" -> price * 0.70
            else -> price
        }
    }
}