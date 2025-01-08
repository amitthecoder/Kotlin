package codeforce

fun main() {
    val t = readln().toInt()
    val results = mutableListOf<Int>()

    repeat(t) {
        val (m, a, b, c) = readln().split(" ").map { it.toInt() }

        val row1Filled = minOf(a, m)
        val row2Filled = minOf(b, m)

        val remainingSeatsInRow1 = m - row1Filled
        val remainingSeatsInRow2 = m - row2Filled

        val totalFilled = row1Filled + row2Filled + minOf(c, remainingSeatsInRow1 + remainingSeatsInRow2)

        results.add(totalFilled)
    }

    results.forEach { println(it) }
}