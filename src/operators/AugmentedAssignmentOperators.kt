package operators

// +=, -=, *=, /=, %= - augmented assignment operators.

fun main(){

    var x = 10
    var y = 5

    x += y      // x = x + y
    println(x)

    x -= y      // x = x - y
    println(x)

    x *= y      // x = x * y
    println(x)

    x /= y      // x = x / y
    println(x)

    y %= x      // y = y % x
    println(x)

}