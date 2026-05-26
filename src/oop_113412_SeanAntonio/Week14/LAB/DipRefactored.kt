package oop_113412_SeanAntonio.Week14.LAB

interface Database {
    fun query(sql: String): List<String>
}

class PostgresDatabase : Database {
    override fun query(sql: String): List<String> = listOf("pg_data1", "pg_data2")
}