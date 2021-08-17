package basics

fun main(){
    val a = "Hello"
    val b: String? = null
    //base call
    println(a.length)
    //Safe call
    println(b?.length)
    //Elvis
    println(b?.length ?: -1)
    //raises NullPointerExp
    println(b!!.length)
}