package oop_113412_SeanAntonio.Week11.Tugas

fun main() {
    val homeDevices = mutableListOf<SmartDevice>()

    val lamp = SmartDevice("Philips WiZ Living Room", "Lighting").apply {
        isOnline = true
        powerLoad = 12
    }.also {
        homeDevices.add(it)
    }
}