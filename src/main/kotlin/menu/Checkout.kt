package menu

import data.*
fun Checkout (): Boolean {
    var priceAll : Int = 0
    if (listOfItemUser.size > 0) {
        println("===================================================")
        println("===CHECKOUT===")
        for(data in listOfItemUser ) {
            priceAll += data.price!!
            println("${data?.name}   --->   ${data?.price}")
        }
        println("Total Price : ${priceAll}")
        print("Insert Money : ")
        val money = readLine()
        val moneyConvert = money!!.toInt()
        val change = moneyConvert - priceAll;
        println("Your Change : ${change}")
        println("Thank You!!!")
        println("===================================================\n\n")
        return true
    } else {
        println("===================================================\n")
        println("There is No Item In Please Add Some Item!!\n")
        println("===================================================")
        return false
    }
}