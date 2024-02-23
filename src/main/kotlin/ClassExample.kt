fun main() {
    val student: Student = Student("Ram", 5, "Dankuni");
    setResult("Student name ${student.name}")
    setResult("Student age ${student.age.toString()}")
    setResult("Student address ${student.address}")
    val students = Student();
    students.name = "Sauvik"
    students.age = 8
    students.address = "Kalipur"
    setResult(students.name + students.age.toString() + students.address)

    val school1 = School("Test school","Kolkata")
    val school2 = School("Test school 2","Park street")
    setResult(school1.printSchool())
    setResult(school2.printSchool())
    
}

public class Student {
    var name: String = ""
    var age: Int = 0
    var address: String = ""

    constructor(name: String, age: Int, add: String) {
        this.name = name
        this.age = age
        this.address = add

    }

    constructor() {

    }
}
public class School(var name:String,var add :String){
    var  names=name;
    var address=add;

    fun printSchool() :String{
        return "Your school name $names . Address $address."
    }

}