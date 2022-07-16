fun main() {
     try {
         println("Enter a random number")
         var input = readLine()!!.toInt()
         var sum = 100/input
         println("sum is $sum")

     }catch (e: Exception){
println(e)
     }
}