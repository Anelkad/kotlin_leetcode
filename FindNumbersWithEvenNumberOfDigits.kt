//https://leetcode.com/explore/learn/card/fun-with-arrays/521/introduction/3237/
fun findNumbers(nums: IntArray): Int {
    return nums.map{it.toString()}.filter { it.length%2==0}.size
}

fun main(){
    println(findNumbers(intArrayOf(12,345,2,6,7896)))
    println(findNumbers(intArrayOf(555,901,482,1771)))
}