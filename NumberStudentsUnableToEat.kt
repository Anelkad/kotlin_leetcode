import java.util.*
import kotlin.collections.ArrayDeque

//https://leetcode.com/problems/number-of-students-unable-to-eat-lunch/
fun countStudents(students: IntArray, sandwiches: IntArray): Int {
    val stack = Stack<Int>()
    val queue = students.toMutableList()
    sandwiches.reversed().forEach { stack.push(it) }
    sandwiches.forEach { sandwiche ->
        if (!queue.contains(sandwiche)) return stack.size
        else {
            stack.pop()
            queue.removeAt(queue.indexOf(sandwiche))
        }
    }
    return stack.size
}

fun main(){
    println(countStudents(intArrayOf(1,1,1,0,0,1),intArrayOf(1,0,0,0,1,1)))
    println(countStudents(intArrayOf(1,1,0,0),intArrayOf(0,1,0,1)))

}