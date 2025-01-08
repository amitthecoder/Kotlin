package codeforce
fun main() {
    val matrix = Array(5) { IntArray(5) }
    var row = 0
    var col = 0

    // Reading the 5x5 matrix and identifying the position of '1'
    for (i in 0..<5) {
        val line = readln().split(" ").map { it.toInt() }
        for (j in line.indices) {
            matrix[i][j] = line[j]
            if (matrix[i][j] == 1) {
                row = i
                col = j
            }
        }
    }

    // Calculate the number of moves to bring '1' to the center (2,2)
    val moves = Math.abs(row - 2) + Math.abs(col - 2)
    println(moves)
}