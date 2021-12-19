// package
import data.listOfItem
import data.setterDiscount
import login.*
import menu.*
import java.lang.NullPointerException

// Exception Handling
fun main(args: Array<String>) {
    setterDiscount(listOfItem)
    var isFinished = false
    while (!isFinished) {
        try {
            LoginSchema()
            MainMenu()
            isFinished = true
        } catch (e : NumberFormatException) {
            println("Error!!!")
        }
         catch (e : IndexOutOfBoundsException) {
             println("Error!!!")
         }
    }


}