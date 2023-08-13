import java.util.*

//https://leetcode.com/problems/valid-parentheses/
fun isValid(s: String): Boolean {
    val stack = Stack<Char>()
    s.forEach {
        when (it){
            ')' -> if (stack.isNotEmpty() && stack.peek()=='(') stack.pop()
            else return false
            ']' -> if (stack.isNotEmpty() && stack.peek()=='[') stack.pop()
            else return false
            '}' -> if (stack.isNotEmpty() && stack.peek()=='{') stack.pop()
            else return false
            else -> stack.push(it)
        }
    }
    return stack.isEmpty()
}

fun main(){
    println(isValid("()[]{}"))
}