fun compression(input: String) : String {
    var answer = ""
    var i = 0
    while (i<=input.lastIndex){
        var j = i+1
        var count = 1
        answer+=input[i]
        while (j<=input.lastIndex && input[i]==input[j]){
            count++
            j++
            i++
        }
        if (count>1) answer+=count
        i++
    }
    return answer
}

fun main(){
    println(compression("ААААИИФФРРНУУУ"))
}