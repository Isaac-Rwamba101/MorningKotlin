import java.util.Scanner

fun main() {
    var read = Scanner(System.`in`)


    println("Enter temperature of patient : ")
    var tempearture = read.nextInt()

    if (tempearture > 37){
        println("High fever")
    }
    else if (tempearture < 37){
        println("Low fever")
    }
    else{
        println("Normal Temperature")
    }



}