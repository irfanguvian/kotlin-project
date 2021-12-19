package menu

import data.listOfItem
import data.listOfItemUser
import data.setterDiscount

fun ProductListPreview() {
    println("""
        1. Buy Products
        2. Back To Menu
    """.trimIndent())
    print("Select Menu: ")
    var choiceProductMenu : String? = readLine()
    val convertedChoice = choiceProductMenu?.toInt()
    var isChoice = true
    if (convertedChoice == 1) {
        println("===ITEM LIST===")
        for((index, data) in listOfItem.withIndex() ) {
            if(data.discount !== null) {
                println("${index + 1}.     ${data.name}  --->  ${data.price}, discount ${data!!.discount!!.times(100).toInt()}%")
            } else {
                println("${index + 1}.     ${data.name}  --->  ${data.price}")
            }

        }
        while(isChoice){
            print("select the item you want to choose: ")
            var itemPick : String? = readLine()
            val itemPickConverted : Int = itemPick!!.toInt()
            val itemIndex : Int = itemPickConverted - 1
            val item = listOfItem.elementAt(itemIndex)
            listOfItemUser.add(item)
            println("item added to cart!")
            print("Do you want to add more item ? (y/n)")
            var isRepeat : String? = readLine()
            if (!isRepeat.equals("y") || isRepeat.equals("Yes") || isRepeat.equals("yes")) {
                isChoice = false
            }
        }
    }
}