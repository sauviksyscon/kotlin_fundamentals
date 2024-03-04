class Triangle(
    val a: Double,
    val b: Double,
    val c: Double
) {
    val height: Double = 7.0

    init {
        println("Triangle is created from $a ,$b,$c")
    }

    fun perimeter() = a + b + c
    fun area() = 0.5 * a * height
}