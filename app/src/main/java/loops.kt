fun main() {
// for loop
    val items = listOf<String>("apple", "banana", "kiwifruit")
    for(item in items){
        println(item)
    }

// while loop
    var index = 0
    while (index < items.size){
        println("item at $index is ${items[index]}")
        index++
    }


}


