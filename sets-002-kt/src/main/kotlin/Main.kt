/**
 * @author Kasey Claramonte Soler - kasclasol@proton.me
 */

/* ----- < MAIN > ----- */
fun main()
{
    println("---")

    // Sets are unordered and duplicate information is ignored
    val fixedSet = setOf(1, 2, 3, 4, 5, 5)
    val mutableSet = mutableSetOf(5, 4, 3, 2, 1)

    println("Elements of 'fixedSet': $fixedSet <- (No duplicate 5)")
    println("Elements of 'mutableSet': $mutableSet")

    println("---")

    isValueInSet(0, mutableSet)

    println("---")

    mutableSet.add(0)
    println("Added 0 to 'mutableSet': $mutableSet")

    println("---")

    isValueInSet(0, mutableSet)
}
/* ----- < MAIN > ----- */

/* ----- < FUNCTIONS > ----- */
private fun isValueInSet(n: Int, set: Set<Int>)
{
    // Check if value is present in mutableSet
    if (n in set)
    {
        println("$n IS in set.")
    }
    else
    {
        println("$n is NOT in set.")
    }
}
/* ----- < FUNCTIONS > ----- */