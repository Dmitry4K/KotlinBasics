package streams

import java.util.stream.Stream

fun main(){
    println(genFiboList(10).joinToString(", ", "[","]"))
}

fun genFiboList(count: Long): List<Int> {
    return Stream.iterate(arrayOf(0,1)) { el -> arrayOf(el[1], el[0] + el[1]) }
        .limit(count)
        .map{el->el[0]}
        .toList()
}