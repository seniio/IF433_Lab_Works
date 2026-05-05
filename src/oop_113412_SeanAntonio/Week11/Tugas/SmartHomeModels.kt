package oop_113412_SeanAntonio.Week11.Tugas

data class SmartDevice(
    var name: String,
    var category: String,
    var isOnline: Boolean = false,
    var powerLoad: Int = 0
)