import java.util.ArrayList

fun main() {
    val number = numberProduct(arrayListOf(1, 2, 3, 4, 5, 6))
    println(number)
    val number2=numberProduct(1,2,3,4,5,6)
    println("using varag $number")

}

fun numberProduct(input: ArrayList<Int>): Int {
    var result: Int = 1
    if (input.size > 0) {
        for (i in 0 until input.size) {
            var temp = input[i]
            result *= temp
        }
    }

    return result
}

fun numberProduct(vararg input:Int): Int {
    var result: Int = 1
    if (input.size > 0) {
        for (i in 0 until input.size) {
            var temp = input[i]
            result *= temp
        }
    }

    return result
}