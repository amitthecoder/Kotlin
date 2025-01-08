package program

fun main(){
    val x = readln().toInt()
    var y : Int = 0
    for (i in 1..x){
        if (x%i==0){
            y++
        }
    }
    if (y==2){
        println("Prime number")
    }
    else{
        println("Not Prime")
    }
}