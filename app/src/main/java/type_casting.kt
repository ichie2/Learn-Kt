


fun getLength(obj : Any) : Int?{
  if(obj is String){
      return  obj.length
  }
    return  null
}


fun main() {
    getLength("Incomprehensibilities")
    getLength(listOf(Any()))
}