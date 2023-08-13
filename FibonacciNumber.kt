//https://leetcode.com/problems/fibonacci-number/
fun fib(n: Int): Int {
    val array = IntArray(n+1)
    array[0] = 0
    if (n>0) array[1] = 1
    if (n>1) for (i in 2..n) array[i] = array[i-1] + array[i-2]
    return array[n]
}

fun main(){
    val n = readLine()!!.toInt()
    println(fib(n))
}