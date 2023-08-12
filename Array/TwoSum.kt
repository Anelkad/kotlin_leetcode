//https://leetcode.com/problems/two-sum/
class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val sortedIndices = nums.indices.sortedBy { nums[it] }
        for (i in sortedIndices.indices){
            val j = sortedIndices.binarySearch(i+1) { nums[it].compareTo(target-nums[sortedIndices[i]]) }
            if (j>0) return intArrayOf(sortedIndices[i], sortedIndices[j])
        }
        return intArrayOf()
    }
}

fun main(){
    println(Solution().twoSum(intArrayOf(2,7,11,15),9).contentToString())
    println(Solution().twoSum(intArrayOf(3,2,4),6).contentToString())
    println(Solution().twoSum(intArrayOf(3,3),6).contentToString())
    println(Solution().twoSum(intArrayOf(0,4,3,0),0).contentToString())
}
