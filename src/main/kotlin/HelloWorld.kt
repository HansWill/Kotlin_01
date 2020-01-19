fun main() {

    println("Hello world")

    var student = "Bob"
    var age = 25
    var height = 5.6
    println("Name is $student, age is $age and height is $height")

    val name = " Harry"
    val programmingLanguage = "Kotlin"
    println("My name is $name and my favorite programming language is $programmingLanguage")
    println("max integer " + Integer.MAX_VALUE)
    println("min integer " + Integer.MIN_VALUE)

    val d1: Double = 7.20E15
    val d2 = 7.20e-15
    println("Value of d1 = $d1 and Value of d2 = $d2")

    var result: Boolean
    var num1 = 20
    var num2 = 10

    result = num1 >= num2
    println("$num1 is greater than $num2 = $result")
    result = num1 > num2
    println("$num1 is greater than $num2 = $result")

    var charA: Char = 'A'
    var charZ: Char = 'Z'
    var char1 = '1'
    var char0 = '0'
    println("$charA $charZ $char1 $char0")

    // Unicode Character
    var ucharA: Char = '\u0041'
    var ucharZ: Char = '\u005A'
    var uchar1 = '\u0031'
    var uchar0 = '\u0030'
    println("$ucharA $ucharZ $uchar1 $uchar0")

    // Safe call operator ?
    var mayBeNull: String?
    mayBeNull = null
    var length = mayBeNull?.length
    println("value of length is: $length")

    // ?: Elvis operator
    var message: String? = null
    var len = message?.length ?: 0
    println("value of length is $len")
    message = "Hello"
    len = message?.length ?: 0
    println("value of length is $len")

    // Convert from Byte to Float
    var byteValue: Byte = 10
    var floatValue: Float
    floatValue = byteValue.toFloat()
    println("From Byte $byteValue to Float $floatValue")

    // Convert from Double to Integer
    var doubleValue = 12.345
    var intValue = doubleValue.toInt()
    println("From Double $doubleValue to Int $intValue")

    // Convert String to Integer
    var stringValue = "12345"
    var integValue = stringValue.toInt()
    println("From string $stringValue to int $integValue")

    mySmartCast(10)
    mySmartCast("Kotlin")
    mySmartCast(null)

    mySecondSmartCast(10)
    mySecondSmartCast(1000L)
    mySecondSmartCast("Kotlin")
    mySecondSmartCast(10.0)

    // working unsafe cast with as when it's not a String it should be null
    myUnsafeCast(2)


}

fun mySmartCast(any : Any?) {
    when (any) {
        is Int -> {
            var i = any + 5
            println("Value is Int $i")
        }
        is String -> {
            var s = "Hello $any"
            println("Value is String $s")
        }
        null -> {
            println("Object is null")
        }
    }
}

fun mySecondSmartCast(any : Any?) {
    when (any) {
        is String -> println("String: $any")
        is Int -> println("Integer; $any")
        is Double -> println("Double: $any")
        else -> println("It's not an String, Integer or Double")
    }
}

// working unsafe cast with as
fun myUnsafeCast(any : Any?) {
    val s: String? = any as? String
    println(s)
}