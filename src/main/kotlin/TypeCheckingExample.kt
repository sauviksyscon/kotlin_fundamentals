class TypeCheckingExample {
}

class Vehicle() {
    fun wheelType(type: String) {
        when (type) {
            "Car" -> 4
            "Track" -> 6
            "Bas" -> 8
            else -> -1
        }
    }
}