//https://leetcode.com/explore/learn/card/fun-with-arrays/521/introduction/3240/

fun sortedSquares(nums: IntArray): IntArray {
    return nums.map{it*it}.sortedBy{it}.toIntArray()
}
fun main() {
    println(sortedSquares(intArrayOf(-4, -1, 0, 3, 10)).contentToString())
    println(sortedSquares(intArrayOf(-7, -3, 2, 3, 11)).contentToString())
}