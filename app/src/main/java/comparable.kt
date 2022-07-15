import java.util.*
import kotlin.collections.ArrayList

fun main() {

   class Person(val name : String, val age : Int): Comparable<Person>{
       override fun compareTo(other: Person): Int {
          return this.age - other.age
       }

   }

   var listOfNames = ArrayList<Person>()

    listOfNames.add(Person("Dammy", 5))
    listOfNames.add(Person("Adekunle", 8))
    listOfNames.add(Person("Seun", 1))

      println("==================> BEFORE <==============")
    for (i in listOfNames){
        println(i.age)
        println(i.name)
    }

    println("==================> AFTER <==============")
    Collections.sort(listOfNames)
    for (i in listOfNames){
        println(i.age)
        println(i.name)
    }
}