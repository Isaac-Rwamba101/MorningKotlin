import java.util.Scanner

fun main() {
    val char = 'b'

    if (char in "aeiou") {
        println("$char is a vowel.")
    } else if (char.isLetter()) {
        println("$char is a consonant.")
    }

}
