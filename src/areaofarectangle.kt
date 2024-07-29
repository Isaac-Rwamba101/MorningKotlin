import java.util.Scanner

fun main() {
    var test = Scanner(System.`in`)

    println("Enter length : ")
    var length = test.nextInt()

    println("Enter widht : ")
    var width = test.nextInt()

    var area = (length * width)
    println("The area of the rectangle is $area")
    


}