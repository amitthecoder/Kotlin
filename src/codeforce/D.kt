fun main() {
    val t = readln().toInt()
    val results = mutableListOf<List<Int>>()

    repeat(t) {
        val n = readln().toInt()
        val a = readln().split(" ").map { it.toInt() }

        val b = MutableList(n) { 0 }
        val freq = mutableMapOf<Int, Int>()
        var mode = a[0]
        var modeFreq = 0

        for (i in 0..<n) {
            val current = a[i]
            freq[current] = freq.getOrDefault(current, 0) + 1

            if (freq[current]!! > modeFreq) {
                mode = current
                modeFreq = freq[current]!!
            }

            b[i] = current

            if (i > 0 && b[i] != mode) {
                // Ensure the mode condition is met
                for (j in 1..n) {
                    if (j != current && freq.getOrDefault(j, 0) < modeFreq) {
                        b[i] = j
                        freq[j] = freq.getOrDefault(j, 0) + 1
                        break
                    }
                }
            }
        }

        results.add(b)
    }

    results.forEach { result ->
        println(result.joinToString(" "))
    }
}