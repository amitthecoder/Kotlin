package codeforce

fun main() {
    val t = readln().toInt()
    val results = mutableListOf<Int>()

    repeat(t) {
        val n = readln().toInt()
        val r = readln().split(" ").map { it.toInt() - 1 }

        // Simulate the process
        var year = 1
        var plushies = IntArray(n) { 1 }
        val visited = Array(n) { false }

        while (true) {
            val newPlushies = IntArray(n)
            for (i in 0 until n) {
                if (plushies[i] > 0) {
                    newPlushies[r[i]]++
                }
            }
            for (i in 0 until n) {
                if (newPlushies[i] > 1) {
                    newPlushies[i] = 1
                }
            }
            if (newPlushies.contentEquals(plushies)) {
                results.add(year + 1)
                break
            }
            plushies = newPlushies
            year++
        }
    }

    results.forEach { println(it) }
}