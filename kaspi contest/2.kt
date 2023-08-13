
fun old(firstString: String, secondString: String) : Boolean {
    val firstMap = firstString.groupBy { it }.toSortedMap().map { (key, values) -> listOf(key, values.size) }
    val secondMap = secondString.groupBy { it }.toSortedMap().map { (key, values) -> listOf(key, values.size) }
    return firstMap == secondMap
}

fun anagram(firstString: String, secondString: String) : Boolean {
    val firstSortedString = firstString.split("").sorted().joinToString()
    val secondSortedString = secondString.split("").sorted().joinToString()
    return firstSortedString==secondSortedString
}


fun main(){
    println(anagram("listen","1silent"))
}