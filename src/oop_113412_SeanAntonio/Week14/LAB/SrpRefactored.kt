package oop_113412_SeanAntonio.Week14.LAB

class UserValidator {
    fun validate(user: User): Boolean {
        return user.email.contains("@") && user.age >= 18
    }
}

class UserRepository {
    fun save(user: User) {
        println("Saving user: ${user.name} to Database")
    }
}

class EmailService{
    fun sendWelcome(user: User) {
        println("welcome email -> ${user.email}")
    }
}