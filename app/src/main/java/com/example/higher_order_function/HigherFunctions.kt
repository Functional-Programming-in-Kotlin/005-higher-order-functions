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

interface Logger {
    fun print(msg: String)
}

class ConsoleLogger: Logger {
    override fun print(msg: String) {
        logToConsole(msg)
    }
}

class FileLogger: Logger {
    override fun print(msg: String) {
        logToFile(msg)
    }
}

class WindowsLogger: Logger {
    override fun print(msg: String) {
        logToWindows(msg)
    }
}

fun main(args: Array<String>) {
    getValue(4, ConsoleLogger())

}