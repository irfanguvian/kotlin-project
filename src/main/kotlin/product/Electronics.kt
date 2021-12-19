package product

// class , constructor, Inheritances
class Electronics (elecName : String, elecPrice: Int) : Product() {
   init {
       name = elecName
       price = elecPrice
   }

}