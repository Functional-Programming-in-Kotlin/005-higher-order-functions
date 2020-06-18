package com.example.higher_order_function

//class HigherFunctions {
//
//}

fun logToConsole(msg: String) {
    println(msg + " From Console")
}

fun logToFile(msg: String) {
    println(msg + " From File")
}

fun logToWindows(msg: String) {
    println(msg + " From Windows")
}

fun main(args: Array<String>) {
    logToWindows("Hello Kotlin FP")
}