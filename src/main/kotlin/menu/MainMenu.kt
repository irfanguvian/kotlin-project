package menu
import data.*
fun MainMenu() {

    var isFinished = false
   while(!isFinished) {
       println("===MENU===")
       println("""
        1. Product
        2. Cart
        3. Checkout
        4. Signup
    """.trimIndent())
       print("Please Enter Menu Options: ")
       var choiceMainMenu : String? = readLine()
       val convertedChoice = choiceMainMenu?.toInt()

       when(convertedChoice) {
           1 ->ProductListPreview()
           2 -> CartListPreview()
           3 -> {
               isFinished = Checkout()
           }
           else -> {
               println("Goodbye")
               isFinished = true
           }
       }
   }
}

