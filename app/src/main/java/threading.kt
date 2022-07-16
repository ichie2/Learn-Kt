fun main() {

   var first = userThread("first")
   first.start()

    var second = userThread("second")
    second.start()

    var third = userThread("third")
    third.start()
    third.join()
    println("Thread is running")

}

  class userThread : Thread {



    constructor(name : String) : super(){
        this.name = name

    }


      override fun run() {
          super.run()

        var count = 0
        while (count < 10){
            println("$name count value : $count")
            count++

            try {
                Thread.sleep(1000)

            }catch (e: Exception){
                println(e.message)
            }
        }

      }


  }

