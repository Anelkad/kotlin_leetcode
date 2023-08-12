//https://leetcode.com/problems/number-of-good-pairs/
fun numIdenticalPairs(nums: IntArray): Int {
    val group = nums.groupBy { it }
    println(group.toString())
    var answer = 0
    group.forEach{
        val n = it.value.size
        if (n>1) answer+=n*(n-1)/2
    }
    return answer
}

fun main(){
    println(numIdenticalPairs(intArrayOf(1,2,3,1,1,3)))
}