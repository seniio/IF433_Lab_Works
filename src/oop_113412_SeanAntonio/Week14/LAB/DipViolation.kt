package oop_113412_SeanAntonio.Week14.LAB

class MySQLDatabase {
    fun query(sql: String): List<String> = listOf("data1", "data2")
}

class UserService {
    private val database = MySQLDatabase()

    fun getUser(id: Int): List<String> {
        return database.query("SELECT * FROM users WHERE id=$id")
    }
}