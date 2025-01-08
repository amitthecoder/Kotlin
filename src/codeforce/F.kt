package codeforce

fun main() {
    val input = generateSequence(::readLine)
    val iterator = input.iterator()

    val (n, m, q) = iterator.next().split(" ").map { it.toInt() }
    val a = iterator.next().split(" ").map { it.toInt() }
    val b = iterator.next().split(" ").map { it.toInt() }

    val totalBeauty = a.sum() * b.sum()
    val rowSums = a.map { it * b.sum() }
    val colSums = b.map { it * a.sum() }

    val queries = List(q) { iterator.next().toInt() }

    val results = mutableListOf<String>()

    for (x in queries) {
        var possible = false
        for (i in 0..<n) {
            for (j in 0..<m) {
                val newBeauty = totalBeauty - rowSums[i] - colSums[j] + a[i] * b[j]
                if (newBeauty == x) {
                    possible = true
                    break
                }
            }
            if (possible) break
        }
        results.add(if (possible) "YES" else "NO")
    }

    results.forEach(::println)
}