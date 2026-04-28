package oop_113412_SeanAntonio.Week10.Tugas

class WalletRepository <T: Any> {
private val items = mutableListOf<T>()

    fun add(item: T) {
        items.add(item)
    }

    fun getAll(): List<T> {
        return items
    }
    fun find(predicate: (T) -> Boolean): T? {
        return items.find(predicate)
    }
}