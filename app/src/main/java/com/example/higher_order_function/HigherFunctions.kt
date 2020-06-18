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

fun getValue(number: Int, logger: Logger): String {
    val result = "Something $number"
    logger.print(result)
    return result
}

enum class Logger {
    CONSOLE, WINDOWS, FILE;

    val print: (String) -> Unit  get() = when(this) {
        CONSOLE -> ::logToConsole
        WINDOWS -> ::logToWindows
        FILE -> ::logToFile
    }
}

fun main(args: Array<String>) {
    getValue(4, Logger.CONSOLE)
}