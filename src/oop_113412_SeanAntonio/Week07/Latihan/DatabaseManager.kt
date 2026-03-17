package oop_113412_SeanAntonio.Week07.Latihan

object DatabaseManager {
    var connectionStatus: String = "Disconnected"

    fun connect() {
        connectionStatus = "Connected to server"
        println("Database is ready.")
    }
}