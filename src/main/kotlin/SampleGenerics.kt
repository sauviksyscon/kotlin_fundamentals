fun main() {
    val intBox = AnyBox(101)
    val stringBox = AnyBox("Hello")
    val result = addition(3,3.5)
    println(result)
}

class AnyBox<T>(val value: T) {
    init {
        println("The box contain $value")
    }

}

fun <T : Number> addition(value1: T, value2: T): Double {
    var result = 0.0
    if (value1 != null && value2 != null)
        result = value1.toDouble() + value2.toDouble()

    return result
}