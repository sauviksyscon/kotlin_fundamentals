fun main() {
    var student = MyStudent()
    student.first = ""
    setResult(student.first)

    val language = ComputerLanguage()
    language._java = "java"
    println(language._java)
    //language.print(language._java)

    language._c = "c"
    //println(language._c)
    language.print(language._c)

    language._python = "python"
    println(language._python)
    language._react = "React"
    println(language._react)
}

class MyStudent() {
    var first: String = ""
        //using getter way 1
        //get()=field.toLowerCase()
        //using getter way 2
        get() {
            return field.toLowerCase()
        }
        set(value) {
            field = if (value.isEmpty()) "Blank string" else "Hello $value"
        }
}

class ComputerLanguage() {

    var _java: String = ""
        set(value) {
            field = if (value.startsWith("j")) "language $value" else "language in correct"
        }
        get() = field.toUpperCase()

    var _c: String = ""
        set(value) {
            field = "$value"
        }
        get() {
            return field
        }

    var _python = ""
        set(value) {
            field = "language $value"
        }
        get() {
            return field
        }

    var _react = ""
        set(value) {
            field = "language $value"
        }
        get() {
            return field
        }

    fun print(msg: String){
        when (msg) {
            "java" -> println("Hello JAVA language choose")
            "c" -> println("Hello C language choose")
            else -> println("Wrong choose")
        }
    }

}