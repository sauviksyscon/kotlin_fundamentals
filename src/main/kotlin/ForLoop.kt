fun main() {
    /*println("Table of 2")
    for (i in 1..10) {
        println("2 * $i = ${2 * i}")
    }*/
//    println("Table of 3")
//    for (i in 1 until 11 step 2)
//        println("3 * $i = ${3 * i}")
    println("pattern print")
    for (i:Int in 0 until 5){
        for (j:Int in 0 until  i) {
            print("${i}")
        }
        println()
    }

}