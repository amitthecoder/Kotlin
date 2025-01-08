fun main() {
    val t = readln().toInt()
    val results = mutableListOf<Long>()

    repeat(t) {
        val (k, l1, r1, l2, r2) = readln().split(" ").map { it.toLong() }
        var count = 0L

        val powersOfK = mutableListOf<Long>()
        var power = 1L
        while (power <= r2) {
            if (power >= l2) {
                powersOfK.add(power)
            }
            if (power > r2 / k) break // Avoid overflow
            power *= k
        }

        for (x in l1..r1) {
            count += powersOfK.count { (it % x).toInt() == 0 && it / x >= l2 && it / x <= r2 }
        }

        results.add(count)
    }

    results.forEach { println(it) }
}