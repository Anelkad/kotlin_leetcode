import java.util.*
import kotlin.collections.ArrayDeque

//https://leetcode.com/problems/number-of-students-unable-to-eat-lunch/
fun countStudents(students: IntArray, sandwiches: IntArray): Int {
    val queue = ArrayDeque<Int>()
    val stack = Stack<Int>()
    sandwiches.reversed().forEach { stack.push(it) }
    students.forEach { queue.addLast(it) }
    while (stack.isNotEmpty() && queue.contains(stack.peek())){
        if (queue.first()==stack.peek()){
            queue.removeFirst()
            stack.pop()
        }
        else {
            queue.addLast(queue.first())
            queue.removeFirst()
        }
    }
    return queue.size
}

fun main(){
    println(countStudents(intArrayOf(1,1,1,0,0,1),intArrayOf(1,0,0,0,1,1)))
    println(countStudents(intArrayOf(1,1,0,0),intArrayOf(0,1,0,1)))

}