fun main() {
    //use if else
    //useIfElse("tiger");

    //use when
    //useWhen("tiger");

    //useWhen2(30);

    var result: String = getAge(6)
    println(result)

    var grade = marks(95)
    println(grade);
}

fun getAge(age: Int): String {
    when (age) {
        in 1..8 -> return "You are child."
        in 9 until 18 -> return "You are boy/girl."
        in 18 until 60 -> return "You are adult."
        in 60..80 -> return "you are senior."
        else -> return "age not applicable."
    }
}

fun useWhen2(input: Int) {
    var result = when (input) {
        1 -> "Input value is $input"
        2 -> "Input value is $input"
        //include upper value i.e 3 to 28
        in 3..28 -> "Input value is $input"
        //include 3 to 29
        in 3 until 30 -> "Input value is $input"
        else -> "Not found"
    }
    setResult(result)
}

fun useWhen(animal: String) {
    when (animal) {
        "lion" -> setResult("Animal is lion.")
        "dog" -> setResult("Animal is dog.")
        "tiger" -> setResult("Animal is tiger.")

        else -> setResult("Animal not found.")
    }


}

fun useIfElse(animal: String) {
    //var animal = "tiger"
    if (animal == "lion")
        setResult("Animal is lion.")
    else if (animal == "dog")
        setResult("Animal is dog.")
    else if (animal == "tiger")
        setResult("Animal is tiger.")
    else
        setResult("Animal not found.")
}

fun marks(number: Int): String {
    var result = when(number){
        in 1..29 -> "Not Qualified"
        in 30..59 ->"Grade C"
        in  60 until 80 -> "Grade B"
        in  80 until 90 -> "Grade A"
        in  90 until 95 -> "Grade AA"
        else -> "Grade AA+"
    }

    return result
}
