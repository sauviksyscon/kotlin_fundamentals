fun main() {

    //bike class
    val bike: Bike = Bike();
    bike.drive("Pleasure")
    //car class
    Car("Alto").drive()

    val employee: Employee = Employee("Software Dev")
    employee.printName("Neel", 32)
    employee.printPosition();

    //overriding
    val androidDev : AndroidDev = AndroidDev("ANDROID DEVELOPER")
    androidDev.print();
    androidDev.printPosition()
    androidDev.printName("Richard",35)
}

class Bike() {
    fun drive(msg: String) {
        println("I love to drive $msg .")
    }
}

class Car(private var name: String) {
    fun drive() {
        var name: String = name;
        println("I lave to ride $name")
    }

}

open class Employee(private var position: String) {
    fun printName(name: String, age: Int) {
        println("Employee - $name , Age - $age")
    }

    fun printPosition() {
        println("Role $position")
    }
}

class AndroidDev(position: String) : Employee(position) {
    fun print() {
        println("Hi I am a Android Developer.")
    }
}