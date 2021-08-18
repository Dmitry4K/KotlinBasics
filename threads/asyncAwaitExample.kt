package threads
import kotlinx.coroutines.*
fun main() = runBlocking {
    println("Hello ${async{getWorld()}.await()}")
}

suspend fun getWorld(): String{
    delay(1000)
    return "world"
}