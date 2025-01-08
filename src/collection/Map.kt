package collection

fun	main()	{

    //	Read-only	map
    val	readOnlyJuiceMenu : Map<String, Int>	=	mapOf("apple"	to	100,	"kiwi"	to	190,	"orange"	to	100)
    println(readOnlyJuiceMenu)
    //	{apple=100,	kiwi=190,	orange=100}

    //	Mutable	map	with	explicit	type	declaration
    val	juiceMenu:	MutableMap<String, Int>	=	mutableMapOf("apple"	to	100,	"kiwi"	to	190,	"orange"	to	100)
    println(juiceMenu)
    //	{apple=100,	kiwi=190,	orange=100}

    // To prevent unwanted modifications, you can create a read-only view of a mutable map by assigning it to a Map:
    val	juiceMenus:	MutableMap<String,	Int>	=	mutableMapOf("apple"	to	100,	"kiwi"	to	190,	"orange"	to	100)
    val	juiceMenuLocked:	Map<String,	Int>	=	juiceMenus

    //  To access a value in a map, use the indexed access operator [] with its key

    println("The	value	of	apple	juice	is:	${readOnlyJuiceMenu["apple"]}")
    //	The	value	of	apple	juice	is:	100
    // If you try to access a key-value pair with a key that doesn't exist in a map, you see a null value

    // You can also use the indexed access operator [] to add items to a mutable map
    juiceMenu["coconut"]	=	150	//	Add	key	"coconut"	with	value	150	to	the	map
    println(juiceMenu)
    //	{apple=100,	kiwi=190,	orange=100,	coconut=150}1

    // To remove items from a mutable map, use the .remove() function
    juiceMenu.remove("orange")
    println(juiceMenu)
    //	{apple=100,	kiwi=190}

    // To get the number of items in a map, use the .count() function
    println(readOnlyJuiceMenu.count())

    // To check if a specific key is already included in a map, use the .containsKey() function
    println(readOnlyJuiceMenu.containsKey("kiwi"))
    //	true

    // To obtain a collection of the keys or values of a map, use the keys and values properties respectively
    println(readOnlyJuiceMenu.keys)
    //	[apple,	kiwi,	orange]

    println(readOnlyJuiceMenu.values)
    //	[100,	190,	100]

    // To check that a key or value is in a map, use the in operator

    println("orange"	in	readOnlyJuiceMenu.keys)
    //	true

    //	Alternatively,	you	don't	need	to	use	the	keys	property

    println("orange"	in	readOnlyJuiceMenu)
    //	true

    println(200	in	readOnlyJuiceMenu.values)
    //	false
}
