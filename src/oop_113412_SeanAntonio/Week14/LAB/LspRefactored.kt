package oop_113412_SeanAntonio.Week14.LAB

interface Shape {
    fun area(): Int
}

class SafeRectangle(var width: Int, var height: Int) : Shape {
    override fun area(): Int = width * height
}

class SafeSquare(var side: Int) : Shape {
    override fun area(): Int = side * side
}