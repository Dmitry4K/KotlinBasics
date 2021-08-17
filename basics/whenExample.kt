package basics

fun main() {
    println(testWhen(1))
    println(testWhen("123"))
    println(testWhen(listOf("2")))
    println(testWhen(23))
}

fun testWhen(input: Any) = when(input){
    is String -> "I am String with length ${input.length}"
    1 -> "I am One"
    is Number -> "I am Number"
    else -> "I am something"
}