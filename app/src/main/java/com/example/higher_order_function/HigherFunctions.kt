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

fun getValue(number: Int, logger: (String) -> Unit): String {
    val result = "Something $number"
    logger(result)
    return result
}


fun main(args: Array<String>) {
    getValue(4, ::logToFile)
}