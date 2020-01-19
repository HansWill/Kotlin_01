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

fun addValues(i: Int, j: Int) : Int {
    return i + j
}