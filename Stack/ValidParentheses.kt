import java.util.*

//https://leetcode.com/problems/valid-parentheses/
fun isValid(s: String): Boolean {
    val stack = Stack<Char>()
    s.forEach {
        if (it== ')'){
            if (stack.isNotEmpty() && stack.peek()=='(') stack.pop()
            else return false
        }
        else if (it== ']'){
            if (stack.isNotEmpty() && stack.peek()=='[') stack.pop()
            else return false
        }
        else if (it== '}'){
            if (stack.isNotEmpty() && stack.peek()=='{') stack.pop()
            else return false
        }
        else stack.push(it)
    }
    return stack.isEmpty()
}

fun main(){
    println(isValid("()[]{}"))
}