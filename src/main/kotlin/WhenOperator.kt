fun main() {
    //use if else
    useIfElse("tiger");

    //use when
    useWhen("tiger");

    useWhen2(30);
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
