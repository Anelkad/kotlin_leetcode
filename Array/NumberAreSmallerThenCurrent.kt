//https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
fun smallerNumbersThanCurrent(nums: IntArray): IntArray {
    val array = nums.sorted()
    return nums.map { array.indexOf(it) }.toIntArray()
}

fun main(){
    println(smallerNumbersThanCurrent(intArrayOf(8,1,2,2,3)).contentToString())
}