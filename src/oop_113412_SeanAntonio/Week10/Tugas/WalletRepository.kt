package oop_113412_SeanAntonio.Week10.Tugas

class WalletRepository <T> {
private val items = mutableListOf<T>()

    fun add(item: T) {
        items.add(item)
    }

    fun getAll(): List<T> {
        return items
    }
}