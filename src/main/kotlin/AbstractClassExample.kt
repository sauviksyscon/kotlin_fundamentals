fun main() {
    var myChild: MyChild = MyChild()
    myChild.displayMessage()
    //val age=myChild.myAge()
    println("Age ${myChild.myAge()}")
}

//abstract class
abstract class MyParent() {
    abstract fun displayMessage()
    abstract fun myAge():Int
}

class MyChild() : MyParent() {
    override fun displayMessage() {
        println("Message displayed successfully.")
    }

    override fun myAge() :Int {
        return 35
    }

}