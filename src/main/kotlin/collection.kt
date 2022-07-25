fun main(args: Array<String>) {
    //Remove Duplicate Strings
    /*
    // Maintain the original order of items
    val devs = arrayOf("Amit", "Ali", "Amit", "Sumit", "Sumit", "Himanshu")
    print(devs.distinct()) // [Amit, Ali, Sumit, Himanshu]

 Maintain the original order of items
    val devs = arrayOf("Amit", "Ali", "Amit", "Sumit", "Sumit", "Himanshu")
    print(devs.toSet()) // [Amit, Ali, Sumit, Himanshu]

// Maintain the original order of items
    val devs = arrayOf("Amit", "Ali", "Amit", "Sumit", "Sumit", "Himanshu")
    print(devs.toMutableSet()) // [Amit, Ali, Sumit, Himanshu]

// DO NOT Maintain the original order of items
    val devs = arrayOf("Amit", "Ali", "Amit", "Sumit", "Sumit", "Himanshu")
    print(devs.toHashSet()) // [Amit, Ali, Sumit, Himanshu]

     */

    ////////////////////////////////////////////////////////

    //Convert an array or list to a string

    val someKotlinCollectionFunctions = listOf(
        "distinct", "map",
        "isEmpty", "contains",
        "filter", "first",
        "last", "reduce",
        "single", "joinToString"
    )

    val message = someKotlinCollectionFunctions.joinToString(
        separator = ", ",
        prefix = "Kotlin has many collection functions like: ",
        postfix = "and they are awesome.",
        limit = 3,
        truncated = "etc "
    )
    print(message)
}