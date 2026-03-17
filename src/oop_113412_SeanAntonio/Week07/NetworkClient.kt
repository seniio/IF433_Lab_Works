package oop_113412_SeanAntonio.Week07

class NetworkClient private constructor(val url: String) {
    fun connect() {
        println("Connecting to $url....")
    }
}