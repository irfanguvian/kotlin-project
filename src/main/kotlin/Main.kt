// package
import data.listOfItem
import data.setterDiscount
import login.*
import menu.*
import java.lang.NullPointerException

// Exception Handling
fun main(args: Array<String>) {
    var isFinished = false
    while (!isFinished) {
        try {
            LoginSchema()
            setterDiscount(listOfItem)
            MainMenu()
            isFinished = true
        } catch (e : NumberFormatException) {
            println("Error!!!")
        }
    }


}