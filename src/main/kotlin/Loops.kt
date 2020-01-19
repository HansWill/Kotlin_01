fun main() {

    println("While loop")
    var i = 1
    while (i <= 3) {
        println("While $i")
        i++
    }

    println("Do While loop")
    var j = 1
    do {
        println(j)
        j++
    } while (j < 5)

    println("for loop with range")
    var range = 1..3
    for (i in range)
        println("value of $i")

    println("for loop with list")
    val list = listOf(1, 2, 3, 4)
    for (l in list)
        println("value of $l")

    println("for in message")
    val message = "kotlin is awesome"
    for (m in message)
        println(m)

    println("nested for loop")
    for (i in 1..3) {
        for (j in 1..3)
            println("$i , $j")
    }

    println("break statements")
    for (i in 1..10) {
        println("For $i")
        if (i >= 5) {
            break
        }
    }

    println("nested loop with break when both values are same")
    for (i in 1..3) {
        for (j in 1..3) {
            println("$i , $j")
            if(i==j) {
                break;
            }
        }
    }

    println("labeled for loop with brake statement")
    outLoop@ for (i in 1..3) {
        for (j in 1..3) {
            if(i==2 && j==2) {
                break@outLoop
            }
            println("$i , $j")
        }
    }
}