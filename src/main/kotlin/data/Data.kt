package data

import menu.*

// interface

interface UserInterface {
   val username : String
   val password : String
}

// data class
data class User(override val username: String, override val password: String) : UserInterface
// collection
val listOfUser = mutableListOf<UserInterface>(
    User("irfan","123")
)

val listOfItemUser = mutableListOf<Product>()

val listOfItem = mutableListOf<Product>(
    Electronics("Iphone 12", 1200),
    Electronics("Iphone 13", 1300),
    Fashion("H&M Shirt", 13),
    Fashion("Air Jordan", 20),
)

fun setterDiscount(list : MutableList<Product>) {
    list[0].setDiscount()
    list[2].setDiscount(0.7F)
}

