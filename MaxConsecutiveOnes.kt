//https://leetcode.com/explore/learn/card/fun-with-arrays/521/introduction/3238/
fun findMaxConsecutiveOnes(nums: IntArray): Int {
    var i = 0
    var answer = 0
    var count = 0

    while (i <= nums.lastIndex) {
        while (nums[i] == 1) {
            count++
            i++
            if (i > nums.lastIndex) break
        }
        answer = if (answer > count) answer else count
        count = 0
        i++
    }

    return answer
}

fun main(){
    println(findMaxConsecutiveOnes(intArrayOf(1,1,0,1,1,1)))
    println(findMaxConsecutiveOnes(intArrayOf(1,0,1,1,0,1)))
}