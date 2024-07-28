fun main() {
    var input: Int = 4
    //useWhile(input)
    //useFor(input)
    multiplicationTable(input)
}

fun useFor(input: Int) {
    for (i in 1..5) {
        setResult("$input X $i = ${input * i}")
    }
    setResult("\nUsing until\n")
    for (i in 1 until 5)
        setResult("$input X $i = ${input * i}")

    setResult("\nUsing step\n")
    for (i in 2..10 step 2)
    //if (i % 2 == 0)
        setResult("$input X $i = ${input * i}")
}

fun useWhile(input: Int) {
    var i: Int = 0;
    while (i <= 10) {
        setResult("$input X $i =  ${input * i}")
        i++
    }

}

fun multiplicationTable(number: Int) {
    println("Multiplication table of $number")
    /*for (i in 1..10) {
        println("$number * $i = ${number * i}")
    }*/
    for (i in 1 until 11) {
        println("$number * $i = ${number * i}")
    }
}
