package menu

open class Product {
    var name : String? = ""
    var price : Int? = 0
    var discount : Float? = null

    fun setDiscount(){
        discount = 0.1F
        val tempPriceNow : Int? = price
        price = tempPriceNow!!.times(1-discount!!).toInt()
    }
    fun setDiscount(customDiscount : Float){
        discount = customDiscount
        val tempPriceNow : Int? = price
        price = tempPriceNow!!.times(1-discount!!).toInt()
    }
}