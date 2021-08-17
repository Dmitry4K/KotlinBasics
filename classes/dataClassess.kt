package classes

fun main(){
    val personDataFirst = PersonData(1,"", 1)
    val personDataSecond = PersonData(1, "", 1)
    val personFirst = Person(1, "")
    val personSecond = Person(1,"")
    val newPersonFirst = NewPerson(1, "")
    val newPersonSecond = NewPerson(1, "")
    println("Is persons equals: ${personFirst==personSecond}")
    println("Is persons data equals: ${personDataFirst==personDataSecond}")
    println("Is new persons equals: ${newPersonFirst==newPersonSecond}")
    println("This is person: $personFirst")
    println("This is personData: $personDataFirst")
    println("This is new person: $newPersonFirst")
    println("This is person hash: ${personFirst.hashCode()}")
    println("This is person data hash: ${personDataFirst.hashCode()}")
}

data class PersonData(val id: Int, val name: String, val age: Int)

class NewPerson(val age: Int, val name: String){
    override fun equals(other: Any?): Boolean {
        if (other == null){
            return false
        }
        if (other !is NewPerson){
            return false
        }
        if (other.age != this.age){
            return false
        }
        return true
    }
}