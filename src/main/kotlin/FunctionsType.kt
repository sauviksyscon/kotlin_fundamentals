fun main() {
    //addition
    var result: Int = add(5, 6)
    setResult("Addition of two numbers $result")
    //even odd func
    setResult("Result: ${evenOdd(7)}")
    //func overloading - same name with count of arguments are greater than previous func
    setResult("In addition of three numbers are ${add(7,10,5)}")

    //store func in variable
    val oddEven=::evenOdd
    setResult("Even / odd - ${oddEven(16)}")
}

//addition
fun add(number: Int, number2: Int): Int = number + number2

fun add(number: Int, number2: Int, number3: Int): Int = number + number2 + number3


//check odd/even
fun evenOdd(input: Int): String {
    return if (input % 2 == 0) "$input is even number." else "$input is odd number."
}

