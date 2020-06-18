package com.example.higher_order_function

//class HigherFunctions {
//
//}

// Firma funcion: (String) -> Unit
fun logToConsole(msg: String) {
    println(msg + " From Console")
}

fun logToFile(msg: String) {
    println(msg + " From File")
}

fun logToWindows(msg: String) {
    println(msg + " From Windows")
}

fun getValue(number: Int, type: Int) {
    val result = "Something $number"
    when (type) {
        1 -> logToConsole(result)
        2 -> logToFile(result)
        3 -> logToWindows(result)
    }
}

fun main(args: Array<String>) {
    getValue(4, 2)
}