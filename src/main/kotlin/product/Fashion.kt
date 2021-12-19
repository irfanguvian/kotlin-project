package product

import product.Product

class Fashion(fashName : String, fashPrice: Int) : Product() {
    init {
        name = fashName
        price = fashPrice
    }

}