package classes


class Person(val age: Int, val name: String){
    var children: MutableList<Person> = mutableListOf()
    init{
        println("Called primary constructor in $name")
    }
    private constructor(): this(-1, "")

    constructor(age: Int, name: String, child: Person): this(age, name){
        this.children.add(child)
        println("Called secondary in $name")
    }
}

fun main(){
    var son = Person(20, "Alex")
    var father = Person(45, "Oleg", son)
}