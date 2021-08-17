package collections

import java.util.*
import kotlin.Comparator

fun main(){
    var list1 = listOf(1,5,2)
    var list2 = listOf(1,5,2)
    val list3 = arrayListOf(1,5,2)
    Collections.sort(list1){a,b -> b-a}
    Collections.sort(list2, object: Comparator<Int>{
        override fun compare(o1: Int, o2: Int) : Int{
            return o2-o1
        }
    })
    list3.sortDescending()
    println(list1.joinToString(", ", "[","]"))
    println(list2.joinToString(", ", "[","]"))
    println(list3.joinToString(", ", "[","]"))
}