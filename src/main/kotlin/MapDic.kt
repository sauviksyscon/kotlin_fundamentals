fun main() {
    var map1 = mutableMapOf<Int, String>();
    map1[0] = "js"
    map1[1] = "java"
    map1[2] = "c"
    map1[3] = "python"

    //println(map1[2])
    for (i: Int in 0 until map1.size) {
        println("${map1[i]}")
        if (map1[i] == "js")
            println("${map1[i]} present in $i th position")
    }
    for ((i: Int, j: String) in map1)
        if (map1[i] == "python")
            println("${map1[i]} present in $i th position")
}