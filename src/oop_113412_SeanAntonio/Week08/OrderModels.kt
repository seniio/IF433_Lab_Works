package oop_113412_SeanAntonio.Week08

class city(val name: String)
class Adress(val city: city?)
class DeliveryDetails(val adress: Adress?)
class order(val deliveryDetails: DeliveryDetails?, val totalPrice:Int?)