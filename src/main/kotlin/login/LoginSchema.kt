package login
import data.listOfUser

fun LoginSchema(){
    var isLogin = true;
    println("Hallo, Welcome To Our Shop")
    println("===LOGIN===")
    while(isLogin) {
        print("Username : ")
        val username : String? = readLine()
        print("Password : ")
        val password : String? = readLine()
        for(user in listOfUser) {
            if (user.username.equals(username) && user.password.equals(password)) {
                isLogin = false;
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
