package variables

fun main(){

//     Val value can't change in runtime and can't reassign
    val x = 10
    println(x)

/*
    var value change in runtime and reassign
    Before reassign
    Declare mutable variables (var) only if necessary.
*/
    var y = 11
    println(y)

//    After Reassign
    y = 12
    println(y)

}