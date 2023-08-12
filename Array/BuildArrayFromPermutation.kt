//https://leetcode.com/problems/build-array-from-permutation/description/
fun buildArray(nums: IntArray): IntArray {
    val array = IntArray(nums.size)
    for (i in nums.indices){
        array[i] = nums[nums[i]]
    }
    return array
}

fun main(){
    println(buildArray(intArrayOf(0,2,1,5,3,4)).contentToString())
    println(buildArray(intArrayOf(5,0,1,2,3,4)).contentToString())
}