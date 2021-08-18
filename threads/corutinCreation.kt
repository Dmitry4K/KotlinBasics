package threads
import kotlinx.coroutines.*
fun main() = runBlocking {
    val job = launch {
        delay(1000)
        println("world")
    }
    println("hello,")
    job.join()
}
