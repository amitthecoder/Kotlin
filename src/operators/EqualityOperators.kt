package operators

// ==, != - equality operators (translated to calls of equals() for non-primitive types)

fun main(){

    val x = 10
    val y = 10
    val z = 5

    println(x==y)   // If both value are equal print true

    println(x==z)   // If both value aren't equal print false

    println(x!=y)   // If both value are equal print false

    println(x!=z)   // If both value aren't equal print true


}