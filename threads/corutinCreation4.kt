package threads

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import java.lang.Exception
import kotlin.random.Random

fun main(){
    retryWhileExecute {
        createPost()
    }
}

fun retryWhileExecute(action: suspend ()->Unit){
    var running = true
    runBlocking {
        while(running){
            running = false
            val job = launch {
                try {
                    action()
                } catch(e: Exception){
                    running = true
                }
            }
            job.join()
        }
    }
}

var count = 3
suspend fun createPost(){
    val delayTime=kotlin.math.abs(Random.nextLong()%2000)
    delay(kotlin.math.abs(delayTime))
    println("Delay time: $delayTime")
    if (count > 0){
        count--
        throw Exception("Post error")
    } else {
        println("Post created")
    }
}
