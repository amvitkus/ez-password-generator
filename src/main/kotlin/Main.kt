import java.util.Scanner

fun main(){
    //PasswordGenerator()

    var password: String = ""
    //Alphabet with no O/o letters
    val letters: Array<Char> = arrayOf('A', 'a', 'B', 'b', 'C', 'c', 'D', 'd', 'E', 'e', 'F', 'f', 'G', 'g', 'H', 'h', 'I', 'i', 'J', 'j', 'K', 'k', 'L', 'l', 'M', 'm', 'N', 'n', 'P', 'p', 'Q', 'q', 'R', 'r', 'S', 's', 'T', 't', 'U', 'u', 'V', 'v', 'W', 'w', 'X', 'x', 'Y', 'y', 'Z', 'z')
    val symbols: Array<Char> = arrayOf('!', '@', '#', '$', ';', '%', '&', '?', '*', '=', '+', '/', '<', '>')
    var running = true
    var runAgain = Scanner(System.`in`)


            print("Please enter a whole number greater than 0 for your password length: ")
            val passwordLength: Int = readLine()!!.toInt()

            for (i in 1..passwordLength) {

                val number: Int = (0..2).random()

                when (number) {
                    0 -> password += letters[(0..51).random()]
                    1 -> password += symbols[(0..29).random()]
                    2 -> password += (0..9).random().toString()
                }
            }

//            println("Password: $password")
//            println("Generate new password?(y/n) ")
//            var runAgain = readLine()!!.toString()
//
//            if (runAgain == "y")

}