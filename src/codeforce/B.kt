package codeforce

fun main() {
    val t = readln().toInt()
    repeat(t) {
        val a = readln()
        val b = a.reversed().map {
            when (it) {
                'p' -> 'q'
                'q' -> 'p'
                else -> it
            }
        }.joinToString("")
        println(b)
    }
}