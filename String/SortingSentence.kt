//https://leetcode.com/problems/sorting-the-sentence/
fun sortSentence(s: String): String {
    val array = s.split(" ")
    val answer = MutableList(array.size) { "" }
    array.forEachIndexed { index, s ->
        answer[s.last().code-49] = s.dropLast(1)
    }
    return answer.joinToString(" ")
}

fun main(){
    println(sortSentence("is2 sentence4 This1 a3"))
}