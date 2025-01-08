package collection

fun	main()	{

    //	Read	only	list
    val	readOnlyShapes : List<String>	=	listOf("triangle",	"square",	"circle")
    println(readOnlyShapes)
    //	[triangle,	square,	circle]

    //	Mutable	list	with	explicit	type	declaration
    val	shapes : MutableList<String>	=	mutableListOf("triangle",	"square",	"circle")
    println(shapes)
    //	[triangle,	square,	circle]

    // To prevent unwanted modifications, you can create a read-only view of a mutable list by assigning it to a List:
    val	shapesType:	MutableList<String>	=	mutableListOf("triangle",	"square",	"circle")
    val	shapesLocked:	List<String>	=	shapes

    // To get the first or last item in a list, use .first() and .last() functions respectively
    val firstItem = shapesType.first()
    println(firstItem)

    val lastItem = shapesType.last()
    println(lastItem)

    // To get the number of items in a list, use the .count() function
    val count = shapesType.count()
    println(count)

    // To check that an item is in a list, use the in operator
    println("circle"	in	shapesType)
    //	true

    // To add or remove items from a mutable list, use .add() and .remove() functions respectively

    shapesType.add("pentagon")
    println(shapesType)
    //	[triangle,	square,	circle,	pentagon]

    //	Remove	the	first	"pentagon"	from	the	list

    shapesType.remove("pentagon")
    println(shapesType)
    //	[triangle,	square,	circle]

}