


class Singleton{
    var name : String? = null

    private constructor(){
        println("instance of singleton is created")
    }

    companion object {
        val instance : Singleton by lazy {Singleton()}
    }
}

fun main() {
    var s1 = Singleton.instance
    s1.name = "Dammy Richie"
    println(s1.name)
    
    
    var s2 = Singleton.instance
    s2.name = "Adekunle"
    println(s2.name)
}