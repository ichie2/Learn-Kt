


fun getLength(obj : Any) : Int?{
  if(obj is String){
      return  obj.length
  }
    return  null
}


fun main() {
    println(getLength("Incomprehensibilities"))
    println(getLength(listOf(Any())))
}