//https://leetcode.com/problems/valid-palindrome/
fun isPalindrome(s: String): Boolean {
    val string = s.lowercase().replace(Regex("[^a-zA-Z0-9]"), "")
    println(string)
    var left = 0
    var right = string.length - 1

    while (left < right) {
        if (string[left] != string[right]) {
            return false
        }
        left++
        right--
    }

    return true
}

fun main(){
    println(isPalindrome("0P"))
}