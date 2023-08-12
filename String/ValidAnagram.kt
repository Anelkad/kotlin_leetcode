//https://leetcode.com/problems/valid-anagram/
fun isAnagram(s: String, t: String): Boolean {
    val map1 = s.groupBy { it }.toSortedMap().map { (key, values) -> listOf(key, values.size) }
    val map2 = t.groupBy { it }.toSortedMap().map { (key, values) -> listOf(key, values.size) }
    return map1 == map2
}

fun main(){
    println(isAnagram("anagram","nagaram"))
}