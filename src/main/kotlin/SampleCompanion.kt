fun main() {
    //static method or companion object
    val result = Common.addition(5, 6)
    println("Addition of 5 and 6 $result")

    //non - static method or
    val sub = Common();
    println("Sub will be ${sub.subtraction(15,8)}")
}

class Common() {
    companion object {
        fun addition(a: Int, b: Int): Int {
            return a + b
        }
    }

    fun subtraction(a: Int, b: Int): Int {
        return a - b
    }

}