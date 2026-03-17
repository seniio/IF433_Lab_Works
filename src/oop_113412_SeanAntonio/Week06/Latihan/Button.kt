package oop_113412_SeanAntonio.Week06.Latihan

class Button (override val name: String) : Clickable {
    override fun click() {
        println("Tombol $name berhasil diklik")
    }
}