
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
    val symbols: Array<Char> = arrayOf('!', '@', '#', '$', ';', '%', '&', '?', '*', '=', '+', '<', '>')
    var running = true
 //   var runAgain = Scanner(System.`in`)


    do {
    print("Please enter a whole number greater than 0 for your password length: ")
    val passwordLength: Int = readLine()!!.toInt()

    for (i in 1..passwordLength) {

        val number: Int = (0..2).random()

        when (number) {
            0 -> password += letters[(0..49).random()]
            1 -> password += symbols[(0..12).random()]
            2 -> password += (0..9).random().toString()
        }
    }
    //} while (running)

    println("Password: $password")

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