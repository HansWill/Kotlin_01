import util.hello

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

    var total = currentExchange(100.0, 10.0, 5.0)
    println(total)
    // with named parameters
    var total1 = currentExchange(dollar = 100.0, currentRate = 10.0, charges = 6.0)
    println(total1)
    total1 = currentExchange(currentRate = 10.0, charges = 6.0, dollar = 100.0)
    println(total1)

    // functions and vararg
    varargString("ett", "tva", "tre")
    varargString("Sat", "Sun", "Mon")
    addVararg(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

// vararg with tricky other arguments, vararg must be last declared to get no errors is good practice
// but not necessary but we must call the rest of variables by name
    trickyVararg(4, 5, 1, 2, 3)
    trickyVararg02(1, 2, 3, a = 4, b = 5)

// use package functions you can use it with package name or to an import: util.hello or with import wildcard util.*
    hello()
    println("Power Function")
    println(util.myPow(5.0, 3.0))
    println("Random number generator")
    var range = 1..50
    for (i in 1..5)
        println(util.myRandom(range))
    println("Value of PI is ${util.PI}")
    println("Area of circle ${util.areaOfCircle(4.0)}")

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

fun currentExchange(dollar: Double, currentRate: Double, charges: Double) : Double {
    var total = dollar * currentRate
    var fees = total * charges / 100
    total -= fees
    return total
}

// functions and vararg
fun varargString(vararg list : String) {
    for (item in list) {
        println(item)
    }
}

fun addVararg(vararg list: Int) {
    var total = 0
    for (item in list) {
        total += item
    }
    println("Total: $total")
}

// vararg with tricky other arguments, vararg must be last declared to get no errors is good practice
// but not necessary but we must call the rest of variables by name
fun trickyVararg(a: Int, b: Int, vararg  list: Int) {
    var total = 0
    for (item in list) {
        total += item
    }
    println("Total $total")
    println("a = $a, b = $b")
}

fun trickyVararg02(vararg list: Int, a: Int, b: Int) {
    var total = 0
    for (item in list) {
        total += item
    }
    println("Total: $total")
    println("a = $a, b = $b")
}