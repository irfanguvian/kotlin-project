// package
import data.listOfItem
import data.setterDiscount
import login.*
import menu.*
import java.lang.NullPointerException

// Exception Handling
fun main(args: Array<String>) {
    try {
        LoginSchema()
        setterDiscount(listOfItem)
        MainMenu()
    } catch (e : NullPointerException) {
        println("Error!!!")
    }

}