fun main() {
    calculate();
}

fun calculate() {
    var value1: Int;
    var value2: Int;
    var value3: Float;
    var value4: Float;
    var value5: Double
    var value6: Double

    value1 = 85
    value2 = 90

    value3 = 0.932897f
    value4 = 0.101255547894136f
    addition(value1, value2);
    subtraction(value1, value2)
    floatAddition(value3, value4)
    printNumber(85)

}

fun addition(value1: Int, value2: Int) {
    var msg: String = "";
    val result: Int = value1 + value1
    msg = "Addition of $value1 and $value2 is $result"
    setResult(msg);
}

fun subtraction(value1: Int, value2: Int) {
    var result: Int;
    if (value1 > value2)
        result = value1 - value2;
    else
        result = value2 - value1;

    setResult("Substraction of $value1 and $value2 is $result")
}

fun floatAddition(value1: Float, value2: Float) {
    var result: Float = 0.00f;
    result = value1 + value2;
    setResult("Float addition of $value1 and $value2 is ${result.toDouble()} ")
}

fun printNumber(value1: Int) {
    for(i in value1..value1+5){
        setResult("Result : $i")
    }

}


fun setResult(msg: String) {
    println(msg)

}
