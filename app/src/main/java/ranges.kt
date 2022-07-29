



// checks if number is within a range

fun main(){
    val x = 10
    val y = 9

    if(x in 1..y+1){
        println("true")
    }
    else{
        println("false")
    }
    outOfRange()
    overRange()
    progression()
}

// checks if  number is out of range

fun outOfRange(){
    val list = listOf<String>("a", "b", "c")

    if(-1 !in 0..list.lastIndex){
        println("-1 is out of range")
    }
    if(list.size !in list.indices){
        println("list size is out of valid indices")
    }
}


// iterate over a range
fun overRange(){
    for(x in 1..5){
        print(x)
    }
}


// over a progression (step and downTo)
fun progression(){
    println()// line breaker (custom)
    for (x in 1..10 step 2){
        println(x)
    }
    println()// line breaker (custom)
    for(x in 9 downTo 0){
        println(x)
    }

    println()// line breaker (custom)
    for(x in 100 downTo 90 step 2){
        println(x)
    }

}