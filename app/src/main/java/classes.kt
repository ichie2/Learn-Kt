fun main() {
    val rectangle = Rectangle(5.0, 2.0)
    println("Area of rectangle is ${rectangle.calculateArea()}")
    println("Perimeter of rectangle is ${rectangle.perimeter}")
}









abstract  class Shape (val sides : List<Double> ){
    val perimeter : Double get() = sides.sum()
    abstract  fun calculateArea(): Double

}

interface  RectangleProperties{
    val  isSquare : Boolean
}


class Rectangle(
    val height : Double,
    var length : Double
    ): Shape(listOf(height, length,height, length )),RectangleProperties{
        override val isSquare : Boolean get() = length == height
        override fun calculateArea(): Double = height * length
    }



