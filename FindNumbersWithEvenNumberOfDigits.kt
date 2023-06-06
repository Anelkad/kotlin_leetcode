fun findNumbers(nums: IntArray): Int {
    return nums.map{i -> i.toString()}.filter { i -> i.length%2==0}.size
}

fun main(){
    //print(findNumbers(intArrayOf(12,345,2,6,7896)))
    print(findNumbers(intArrayOf(555,901,482,1771)))
}