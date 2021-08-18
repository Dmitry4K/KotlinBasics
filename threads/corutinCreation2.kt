package threads
import kotlinx.coroutines.*
fun main() {
    runBlocking {
        val job1 = launch {
            lazyHello()
        }
        val job2 = launch {
            quickHello()
        }
        job1.join()
        job2.join()
    }
}

suspend fun lazyHello(){
    delay(1500)
    println("lazyHello")
}
suspend fun quickHello(){
    delay(1000)
    println("quickHello")
}