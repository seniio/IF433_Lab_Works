package oop_113412_SeanAntonio.Week6.Latihan1

class Button (override val name: String) : Clickable {
    override fun click() {
        println("Tombol $name berhasil diklik")
    }
}