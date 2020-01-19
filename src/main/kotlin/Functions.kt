fun main() {

    //function with no parameter and return type
    sayHelloWorld()

    //function with parameter
    hello("Kotlin")

    add(5, 5)

    // function with parameter and return type
    val result = myFun("Author")
    println(result)

    val result1 = addValues(5, 6)
    println(result1)

    // function as expression
    val result2 = addValuesEx(5, 5)
    println(result2)

    // expression function with return type
    var val1 = 8
    var val2 = 6
    var maxEx = getMax(val1, val2)
    println("$val1, $val2 : Max value is $maxEx")

    // function with default arguments
    hello2()
    hello2("World")

}

// function with no parameter and return type
fun sayHelloWorld() {
    println("Hello from Kotlin")
}

// function wit parameter
fun hello(message: String) {
    println("Hello from $message")
}

fun add(a: Int, b: Int) {
    println("Result of $a + $b is ${a + b}")
}

// function with parameter and return type
fun myFun(message: String) : String {
    return "Hello from $message"
}

// function with 2 Int parameters also return must be Int
fun addValues(i: Int, j: Int) : Int {
    return i + j
}

// function with one line body can also be written as expression
// also explicit declaration of function return type can be removed
fun addValuesEx(a: Int, b: Int) = a + b

// expression function with return type
fun getMax(x: Int, y: Int) : String =
    if (x >= y) {
        x
        "Scary"
    } else {
        y
        "Yes it is"
    }

// function with default arguments
fun hello2(message: String = "Kotlin") {
    println("Hello $message")
}