package menu

import data.*

fun CartListPreview() {
    var isLoop = true
    while(isLoop) {
    if (listOfItemUser.size > 0) {
           println("===================================================")
           println("===CART===")
           for((index, data) in listOfItemUser.withIndex()  ) {
               println("${index + 1}.  ${data?.name}  --->  ${data?.price}")
           }
           println("""
        1. Delete Item
        2. Back To Menu
    """.trimIndent())
           print("Select Menu: ")
           var isDeleteItem : Int? = readLine()!!.toInt()
           if(isDeleteItem == 1) {
               print("Please Select Item You wanna Delete: ")
               var itemChoice : Int? = readLine()!!.toInt()
               listOfItemUser.removeAt(itemChoice!!.minus(1))
           } else {
               isLoop = false
           }
           println("===================================================")
    } else {
        println("There is No Item In Cart, Please Select an Item!!!")
        isLoop = false
    }
    }
}