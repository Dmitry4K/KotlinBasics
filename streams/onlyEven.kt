package streams

fun main(){
    println(onlyEven(1,2,3,4,5,6).joinToString())
}

fun onlyEven(vararg numbers: Int) : List<Int> = numbers.toList().filter { x: Int -> x % 2 == 0 }.toList()

