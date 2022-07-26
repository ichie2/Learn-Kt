


//
fun parseInt(str: String) : Int?{
    return str.toIntOrNull()
}


fun product(arg1 : String, arg2 :String){
    val x = parseInt(arg1)
    val y = parseInt(arg2)

    if(x != null && y != null){
        println(x * y)

    }else{
        println("either args1 or args2 is not a number")
    }
}


fun main() {
    product("6","7")
    product("a","7")
    product("a","b")

}