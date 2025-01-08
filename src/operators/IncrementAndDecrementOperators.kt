package operators

// ++, -- - increment and decrement operators.

fun main(){

    var x = 10
    // println(x++)
    x++                 // Post increment it means increment after operation
    println(x)

    var y = 10
    println(++y)        // Pre increment it means increment before operation

    var a = 10
    // println(a--)
    a--                 // Post decrement it means decrement after operation
    println(a)

    var b = 10
    println(--b)        // Pre decrement it means decrement before operation
}