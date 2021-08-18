package strings

import java.lang.StringBuilder

fun main(){
    val str1: String = StringBuilder().append("hello").append(", ").append("world").toString()
    val str2 = "hello, world"
    println("Str1 : $str1")
    println("Str2 : $str2")
    println(str1 == str2)
}