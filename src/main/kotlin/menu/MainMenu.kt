package menu

fun mainMenu() {

    var isFinished = false
    // looping
   while(!isFinished) {
       println("===MENU===")
       println("""
        1. Product
        2. Cart
        3. Checkout
        4. Signup
    """.trimIndent())
       print("Please Enter Menu Options: ")
       // Konversi tipe data
       val choiceMainMenu : String? = readLine()

       when(choiceMainMenu?.toInt()) {
           1 -> productListPreview()
           2 -> cartListPreview()
           3 -> {
               checkout()
           }
           else -> {
               println("Goodbye")
               isFinished = true
           }
       }
   }
}

