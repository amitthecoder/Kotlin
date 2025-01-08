package variables

fun main(){

//    Long is an Integer Data type that store numerical value from -9,223,372,036,854,775,808 (-2 to the power 63) to 9,223,372,036,854,775,807 (2 to the power 63 - 1)
//    Size = 64 Bits

    val x : Long = -9223372036854775807L // Minimum Value of Long data type
    println("minimum Value $x")

    val y : Long = 23372036854775807L // Mid-Value Value of Long data type
    println("mid Value $y")

    val z : Long = 9223372036854775807L // Maximum Value of Long data type
    println("Maximum Value $z")

    val a : Long = Long.MAX_VALUE
    println("Max Value $a")

    val b : Long = Long.MIN_VALUE
    println("Min Value $b")
}