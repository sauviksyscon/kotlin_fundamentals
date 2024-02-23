fun main() {

    var student: MStudent = MStudent()
    student.studentName = "hello"
    student.studentAge = 5
    println("Student name ${student.studentName} and after 10 years age will be ${student.studentAge}")
}

class MStudent() {
    var studentName: String = ""
        set(value) {
            if (value.isNotEmpty())
                field = value
            else
                field = "N/A"
        }
        get() {
            return field.uppercase();
        }

    var studentAge: Int = 0
        set(value) {
            if (value > 0)
                field = value
            else
                field = 0;
        }
        get() {
            return field.plus(10)
        }
}