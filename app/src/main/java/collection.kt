import java.util.*

fun main() {
    val items = listOf<String>("apple", "banana", "kiwi")

    for(i in items){
        println(i)
    }


    // checking if a collection contains an object
   when{
       "orange" in items -> println("Juicy")
       "apple" in items -> println("forbidden fruit")
   }

    // using lambda expr to filter and map collections

    val fruits = listOf<String>("banana", "avocado", "apple", "kiwi")

    fruits.filter { it.startsWith("a") }
        .sortedBy { it }
        .map { it.uppercase(Locale.getDefault()) }
        .forEach { println(it) }
}



