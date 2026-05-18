package oop_113412_SeanAntonio.Week13
import java.io.File

fun main() {
    println("=== TEST UNSAFE RESOURCE HANDLING ===")
    val unsafeFile = File("unsafe_logs.txt")
    val writer = unsafeFile.printWriter()

    try {
        writer.println("Log 1: Membuka koneksi database...")
        writer.println("Log 2: Menulis data pengguna...")
    } finally {
        writer.close()
    }
    println("Proses penulisan unsafe selesai.")
}