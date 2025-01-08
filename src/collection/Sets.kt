package collection

fun	main()	{

    //	Read-only	set
    val	readOnlyFruit : Set<String>	=	setOf("apple",	"banana",	"cherry",	"cherry")
    println(readOnlyFruit)

    //	Mutable	set	with	explicit	type	declaration
    val	fruit :	MutableSet<String>	=	mutableSetOf("apple",	"banana",	"cherry",	"cherry")
    println(fruit)

    // To prevent unwanted modifications, you can create a read-only view of a mutable set by assigning it to a Set:
    val	fruits:	MutableSet<String>	=	mutableSetOf("apple",	"banana",	"cherry",	"cherry")
    val	fruitLocked:	Set<String>	=	fruits

    // To get the number of items in a set, use the .count() function
    val count = fruits.count()

    // To check that an item is in a set, use the in operator
    println("banana" in fruits)
    //	true

    // To add or remove items from a mutable set, use .add() and .remove() functions respectively

    fruits.add("dragonFruit") //	Add	"dragon fruit"	to	the	set
    println(fruits)

    fruits.remove("dragonFruit")	//	Remove	"dragon fruit"	from	the	set
    println(fruits)

    }