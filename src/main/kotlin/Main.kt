import data.*
import login.*
import menu.*
import java.lang.NullPointerException

fun main(args: Array<String>) {
    try {
        LoginSchema()
        MainMenu()
    } catch (e : NullPointerException) {
        println("Error!!!")
    }

}