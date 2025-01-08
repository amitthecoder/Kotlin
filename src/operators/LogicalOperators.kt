package operators

// &&, ||, ! - logical 'and', 'or', 'not' operators (for bitwise operations, use the corresponding infix functions instead)

fun main(){
    val a = true
    val b = false
    val c = false
    val d = true

    println("Logical AND")

    //    Print true if every comparing element is true

    println(a&&b)
    println(a&&d)
    println(b&&c)

    println("Logical OR")

    //    Print false if every comparing element is true

    println(a||b)
    println(a||d)
    println(b||c)

    println("Logical NOT")

    //  Print true if false and print false if true

    println(!a)
    println(!b)
}