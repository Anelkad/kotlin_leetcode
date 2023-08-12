//https://leetcode.com/problems/merge-similar-items/
fun mergeSimilarItems(items1: Array<IntArray>, items2: Array<IntArray>): List<List<Int>> {
    return (items1 + items2)
            .groupBy { it[0] }
            .map { (key, values) -> listOf(key, values.sumOf {it[1]}) }
            .sortedBy { it.first() }
}

fun main(){
    println(
            mergeSimilarItems(
                    arrayOf(
                            intArrayOf(1,1),
                            intArrayOf(4,5),
                            intArrayOf(3,8)
                    ),
                    arrayOf(
                            intArrayOf(3,1),
                            intArrayOf(1,5)
                    )
            )
    )
}