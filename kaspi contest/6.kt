/*

 */

fun unique(items: List<Int>) : Int {
    val set = items.toSet()
    set.forEach { int ->
        val count = items.count { it == int }
        if ( count == 1 ) return int
    }
    return 0
}

fun main(){
    println(unique(listOf(2,2,3,1,1)))
}