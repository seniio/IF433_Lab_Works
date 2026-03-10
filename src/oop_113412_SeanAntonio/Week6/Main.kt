package oop_113412_SeanAntonio.Week6

fun main() {

    val lamp = SmartLamp("L1", "Ruang Tamu")
    val speaker = SmartSpeaker("S1", "Google Nest Dapur")
    val cctv = SmartCCTV("C1", "Ezviz Garasi")

    val hub = SmartHomeHub()

    hub.addDevice(lamp)
    hub.addDevice(speaker)
    hub.addDevice(cctv)

    hub.activateSecurityMode()

    println("----")

    hub.turnOffAllSwitches()
}
