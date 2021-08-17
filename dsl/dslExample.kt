fun myRepeatDSl(times: Int, action: (Int) -> Unit){
    for (i in 0 until times){
        action(i)
    }
}


fun main(){
    myRepeatDSl(10){
        println(1)
    }
}




