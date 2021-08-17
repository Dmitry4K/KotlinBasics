package threads

class MyThread(private val index: Int, private val count: Int) : Thread(){
    override fun run() {
        for (i in 0..count){
            sleep(2)
            println("This is thread $index")
            yield()
        }
    }
}

fun main(){
    val t1 = MyThread(1, 10)
    val t2 = MyThread(2, 10)
    val t3 = Thread { for (i in 0..10) { Thread.sleep(2); println("Runnable Thread") }}

    t1.start()
    t2.start()
    t3.start()

    t1.join()
    t2.join()
    t3.join()
}