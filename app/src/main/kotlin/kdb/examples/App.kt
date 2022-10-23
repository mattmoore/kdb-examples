package kdb.examples

import kdb.hello

class App {
    val greeting: String
        get(): String =
            hello("Matt")
}

fun main() {
    println(App().greeting)
}
