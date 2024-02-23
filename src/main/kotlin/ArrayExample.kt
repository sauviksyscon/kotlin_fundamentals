fun main() {
    var arr1 = arrayOf(2, 5, 8, 10)
    //set without index
    setResult("Without index")
    for (i in arr1){
        setResult("$i")
    }
    setResult("With index - element")
    for ((i: Int, e: Int) in arr1.withIndex())
        setResult("Result $i - $e")
}
