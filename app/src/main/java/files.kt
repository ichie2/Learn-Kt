import java.io.FileReader
import java.io.FileWriter

fun main() {

   println("1 => Write \n 2 => Read")
   val res = readLine()!!.toInt()
   when(res){
       1 -> {
        println("What would you like to write")
        writeToFile(readLine().toString())
       }

       2 -> {
         readFromFile()
       }
   }
}





// write to file
 fun writeToFile(str: String){
     try {
        var pen = FileWriter("example.txt", true)
         pen.write(str)
         pen.close()

     }catch (e: Exception){
         println(e.message)
     }
 }




// read from file
fun readFromFile(){

    try {
        val reader = FileReader("example.txt")
        var c : Int?
        do {
           c = reader.read()
            println(c.toChar())
        } while (c!=-1)

        println("End of line")

    }catch (e: Exception){
        println(e.message)
    }
}