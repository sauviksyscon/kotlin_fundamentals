fun main() {
    setResult("Polymorphism example\n")
    //inheritance
    val circle :Circle=Circle(2.5)
    setResult("Area of Circle ${circle.area()}")

    //inheritance
    val square: Square = Square(4.5)
    setResult("Area of Square:${square.area()}")

    //polymorphism - can use parent object directly
    val rectangular :Shape=Rectangular(5.5,6.5)
    setResult("Area of Rectangular ${rectangular.area()}")
}
open class Shape(){
    open fun area():Double{
        return 0.0
    }
}

class Circle(var radius:Double) : Shape() {

    override fun area(): Double {
        return 2*3.14*radius
    }

}
class Square(var side:Double) :Shape(){
    override fun area(): Double {
        return side*side
    }
}
class Rectangular(var length:Double,var width:Double) :Shape(){
    override fun area(): Double {
        return 2*length*width
    }
}