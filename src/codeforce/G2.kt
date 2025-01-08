package codeforce

fun main() {
    val t = readln().toInt()
    val results = mutableListOf<Int>()

    repeat(t) {
        val n = readln().toInt()
        val r = readln().split(" ").map { it.toInt() - 1 }

        val visited = IntArray(n) { -1 }
        var maxCycleLength = 1

        for (i in 0..<n) {
            if (visited[i] == -1) {
                var current = i
                var length = 0

                while (visited[current] == -1) {
                    visited[current] = i
                    current = r[current]
                    length++
                }

                if (visited[current] == i) {
                    maxCycleLength = lcm(maxCycleLength, length)
                }
            }
        }

        results.add(maxCycleLength)
    }

    results.forEach { println(it) }
}

fun gcd(a: Int, b: Int): Int {
    if (b == 0) return a
    return gcd(b, a % b)
}

fun lcm(a: Int, b: Int): Int {
    return a / gcd(a, b) * b
}