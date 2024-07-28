fun main(){
    //call primary constructor
    val person = Person()
    println(person.age)

    val user = User("svk.mondal@gmail.com","pass###123")
    user.print()
    //println(user.print())


}
//Person class with primary constructor
class Person(){
    val age = 12
    init {
        println("My age is $age")
    }
}
//User class with primary constructor include header
class User(val userName:String,val password:String){
    init {
        println("init() called")
    }

    fun print(){
        println("userName - $userName and password - $password" )
    }
}
