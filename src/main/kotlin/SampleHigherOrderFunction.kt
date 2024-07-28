fun main(){
    higherOrder(add)

}
val add = {a:Int,b:Int -> a+b}
fun higherOrder(funcAdd : (Int,Int) -> Int){
    println(funcAdd(3,5))

}