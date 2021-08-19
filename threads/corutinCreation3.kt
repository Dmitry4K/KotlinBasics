package threads
import kotlinx.coroutines.*
import kotlin.random.Random

fun main(){
    runBlocking {
        repeat(10) {
            launch{
                createPost(it)
            }
        }
    }
}
suspend fun createPost(num: Int){
    val delayTime = kotlin.math.abs(Random.nextLong()) %2000
    delay(delayTime)
    println("This is message from $num with delay time $delayTime")
}