fun main() {
    var beng: Int = 30;
    var eng: Int = 19;
    //logical operator
    useComparisonOperator(beng, eng)
    //logical operator
    logicalOPerator();
}

fun logicalOPerator() {
    TODO("Not yet implemented")
}

fun useComparisonOperator(beng: Int, eng: Int) {
    var isPassed = false;
    var isGreater = true;
    var isEqual=true;
    //">" is call comparison operator
    isPassed = beng + eng > 50

    isGreater = beng < eng

    isEqual = beng == eng

    if (isPassed)
        setResult("Passed. \nResult : $isPassed")
    else
        setResult("Failed. \nResult : $isPassed")

    if (isGreater)
        setResult("English is greater than Bengali.Result $isGreater")
    else
        setResult("Bengali is greater than english.Result $isGreater")

    if (isEqual)
        setResult("Both subject is equal.Result $isEqual")
    else
        setResult("Both marks are not equal.Result $isEqual")
}