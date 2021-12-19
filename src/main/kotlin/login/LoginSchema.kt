package login
import data.listOfUser

fun loginSchema(){
    var isLogin = true
    println("Hallo, Welcome To Our Shop")
    println("===LOGIN===")
    while(isLogin) {
        print("Username : ")
        val username : String? = readLine()
        print("Password : ")
        val password : String? = readLine()
        for(user in listOfUser) {
            if (user.username == username && user.password == password) {
                isLogin = false
            }
        }
        if (isLogin) {
            println("Login Invalid, Please Insert Correct Data!!!")
            println("===================================================\n")
        } else {
            println("Login Success!")
            println("===================================================")
        }
    }
}
