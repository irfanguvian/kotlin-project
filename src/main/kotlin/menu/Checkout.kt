package menu

import data.*

// safe calls and elvis operator
fun Checkout ()  {
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
        if (change < 0) {
            println("the money you input is not enough, redirected to menu!")
        } else {
            println("Your Change : ${change}")
            println("Thank You!!!")
            println("===================================================\n")
            listOfItemUser.clear()
        }
    } else {
        println("===================================================\n")
        println("There is No Item In Please Add Some Item!!\n")
        println("===================================================")
    }
}