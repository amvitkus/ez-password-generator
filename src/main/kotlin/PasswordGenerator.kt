
fun main() {

    var password = ""
    //Alphabet with no O/o letters
    val letters: Array<Char> = arrayOf(
        'A',
        'a',
        'B',
        'b',
        'C',
        'c',
        'D',
        'd',
        'E',
        'e',
        'F',
        'f',
        'G',
        'g',
        'H',
        'h',
        'I',
        'i',
        'J',
        'j',
        'K',
        'k',
        'L',
        'l',
        'M',
        'm',
        'N',
        'n',
        'P',
        'p',
        'Q',
        'q',
        'R',
        'r',
        'S',
        's',
        'T',
        't',
        'U',
        'u',
        'V',
        'v',
        'W',
        'w',
        'X',
        'x',
        'Y',
        'y',
        'Z',
        'z'
    )
    //Symbols for password
    val symbols: Array<Char> = arrayOf('!', '@', '#', '$', ';', '%', '&', '?', '*', '=', '+', '<', '>')
    //Boolean to check if program is running
    var running = true

    do {
    print("Please enter a whole number greater than 0 for your password length: ")
    val passwordLength: Int = readLine()!!.toInt() //read password length

    //1 to password length, go through each spot in password length
    for (i in 1..passwordLength) {

        //Generate random number between 0 and 2
        val number: Int = (0..2).random()

        //Select random letter, symbol, or number for each spot in password length
        when (number) {
            0 -> password += letters[(0..49).random()]
            1 -> password += symbols[(0..12).random()]
            2 -> password += (0..9).random().toString() //0 through 9, make it a string
        }
    }

        //Print the password
    println("Password: $password")

        //Ask user to run program again
            println("Generate new password?(y/n) ")
            val runAgain = readLine()!!.toString()
//
            if (runAgain == "n") {
                println("Exiting program, goodbye!")
                running = false
            } else {
                password = ""
            }

} while (running)


}