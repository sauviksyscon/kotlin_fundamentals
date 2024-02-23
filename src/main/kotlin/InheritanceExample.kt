fun main() {
    val resuilt: Int = Child().result
    Child().print(resuilt.toString())
    val r: Int = Child2().r2
    Child().print(r.toString())

    val child2 :Child2=Child2()
    setResult(child2.r1.toString())
    setResult("Multiplication : ${child2.multi(5,6).toString()}")

    val multi=Child2().multi(2,4)
    setResult(multi.toString())


}

//parent
open class Father {
    fun add(val1: Int, val2: Int): Int {
        return val1 + val2
    }

    fun sub(val1: Int, val2: Int): Int {
        return if (val1 > val2) val1 - val2 else val2 - val1
    }
    open fun multi(val1:Int,val2:Int):Int{
        return 0
    }

}

//child
class Child : Father() {
    var result: Int = Father().add(5, 6)
    fun print(msg: String) {
        println("Result -> $msg")
    }
}

//child
class Child2 : Father() {
    var r1 = Father().add(7, 6)
    var r2 = Father().sub(8, 14)

    override fun multi(val1: Int, val2: Int): Int {
        return val1*val2
    }

}
