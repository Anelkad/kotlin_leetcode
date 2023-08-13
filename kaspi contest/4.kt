fun switch(input: String): String {
    val russianString = input.filter {
        Regex("[а-яА-Я]").matches(it.toString())
    }.reversed()
    //println(russianString)
    val answer = StringBuilder(input)
    var j = -1
    for (i in input.indices){
        if (Regex("[а-яА-Я]").matches(input[i].toString())){
            j++
            answer[i] = russianString[j]
        }
    }
    return answer.toString()
}

fun main(){
    println(switch("А-бв-КеЬ-ЕАИд"))
}