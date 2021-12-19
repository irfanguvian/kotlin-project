// package
import data.listOfItem
import data.setterDiscount
import login.*
import menu.*

// Exception Handling
fun main() {
    setterDiscount(listOfItem)
    var isFinished = false
    while (!isFinished) {
        try {
            loginSchema()
            mainMenu()
            isFinished = true
        } catch (e : NumberFormatException) {
            println("Error!!!")
        }
         catch (e : IndexOutOfBoundsException) {
             println("Error!!!")
         }
    }


}