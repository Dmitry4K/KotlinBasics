package threads

fun main(){
    val count=1000
    println("Increment race without sync: ${IncrementRace().run(count)}")
    println("Increment race with sync: ${IncrementRaceWithSync().run(count)}")
}

class IncrementRace{
    private var x = 0
    fun run(count: Int): Int{
        val runnable = Runnable {
            repeat(count){
                x++
            }
        }
        val t1 = Thread(runnable)
        val t2 = Thread(runnable)
        t1.start()
        t2.start()
        t1.join()
        t2.join()
        return x
    }

}
class IncrementRaceWithSync{
    private var x : Int = 0
    private var lock = Object()
    fun run(count: Int): Int{
        val runnable = Runnable {
            repeat(count){
                synchronized(lock){
                    x++
                }
            }
        }
        val t1 = Thread(runnable)
        val t2 = Thread(runnable)
        t1.start()
        t2.start()
        t1.join()
        t2.join()
        return x
    }
}
