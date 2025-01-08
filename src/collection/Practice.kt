package collection

// Exercise 1
// You have a list of “green” numbers and a list of “red” numbers.
// Complete the code to print how many numbers there are in total

fun	exone()	{
    val	greenNumbers	=	listOf(1,	4,	23)
    val	redNumbers	=	listOf(17,	2)
    val totalNumber = greenNumbers.count()+redNumbers.count()
    println(totalNumber)
}

//Exercise 2
//You have a set of protocols supported by your server.
//A user requests to use a particular protocol.
//Complete the program to check whether the requested protocol
//is supported or not (isSupported must be a Boolean value).

fun extwo(){
    val	supported	=	setOf("HTTP",	"HTTPS",	"FTP")
    val	requested	=	"smtp"
    val	isSupported	=	requested.uppercase() in supported
    println("Support	for	$requested:	$isSupported")
}

//Exercise 3
//Define a map that relates integer numbers from 1 to 3 to their corresponding spelling.
//Use this map to spell the given number.

fun exthree(){
    val	number2word	= mapOf(1 to "One",2 to "Two",3 to "Three")
    val	n	=	2
    println("$n	is	spelt	as	'${number2word[n]}'")
}

fun main(){

    exone()
    extwo()
    exthree()

}
