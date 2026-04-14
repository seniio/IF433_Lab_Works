package oop_113412_SeanAntonio.Week08.LatihanTerbimbing

class NotificationService {
    fun sendEmail(emailAddress: String) {
        println("Mengirim email ke : $emailAddress")
    }

    fun processUser(user: UserProfile) {
        if (user.email != null) {
            sendEmail(user.email)
        } else {
            println("user ${user.name} tidak memiliki email.")
        }
    }
}
