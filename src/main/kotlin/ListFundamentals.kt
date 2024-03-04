fun main(){
    /*var list = mutableListOf<Int>(1,2,3,4,5,6)
    for (i in list)
        println(i)
    list.add(7)
    for (i in list)
        println(i)*/

    /*enter 5 number & save them to list*/
    var customList= mutableListOf<Int>()
    for (i:Int in 0 until 5){
        val input= readln().toInt()
        if (input!=null)
            customList.add(input)
    }
    println(customList)
}