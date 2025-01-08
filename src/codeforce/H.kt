package codeforce

fun main() {
    val input = generateSequence(::readLine).iterator()
    val t = input.next().toInt()
    val results = mutableListOf<Int>()

    repeat(t) {
        val (n, q) = input.next().split(" ").map { it.toInt() }
        val matrix = Array(n) { input.next().split(" ").map { it.toInt() }.toIntArray() }

        repeat(q) {
            val (x1, y1, x2, y2) = input.next().split(" ").map { it.toInt() - 1 }
            var sum = 0
            var index = 1

            for (i in x1..x2) {
                for (j in y1..y2) {
                    sum += matrix[i][j] * index
                    index++
                }
            }

            results.add(sum)
        }
    }

    results.forEach { println(it) }
}