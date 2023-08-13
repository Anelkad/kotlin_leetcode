fun old(target: Int, numbers: List<Int>) : List<Int> {
    val sortedIndices = numbers.indices.sortedBy { numbers[it] }
    for (i in sortedIndices.indices){
        val binarySearch = sortedIndices.binarySearch(i+1) {
            numbers[it].compareTo(target-numbers[sortedIndices[i]])
        }
        if (binarySearch>0) return listOf(sortedIndices[i], sortedIndices[binarySearch])
    }
    return listOf()
}

fun targetSum(target: Int, numbers: List<Int>) : List<Int> {
    for (i in numbers.indices){
        var j = i+1
        while (j<=numbers.lastIndex){
            if (numbers[i]+numbers[j]==target) return listOf(i,j)
            j++
        }
    }
    return listOf()
}

fun main(){
    println(targetSum(9,listOf(2,5,7,1,3)))
}