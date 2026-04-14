package oop_113412_SeanAntonio.Week08.LatihanTerbimbing

object DatabaseMock {
    fun findUser(id: Int): UserProfile? {
        return if (id == 1) UserProfile("TestUser", "test@test.com") else null
    }

    fun runMockUnitTest() {
        println("\n=== RUNNING UNIT TEST ===")
        val testUser = findUser(1)
        val initial = testUser!!.name.substring(0, 1)
        check(initial == "T") { "Test Failed! Initial is wrong." }
        println("Test Passed: Initial is T")
    }
}