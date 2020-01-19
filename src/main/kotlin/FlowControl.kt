fun main() {

    ifElse()

    // if statement with && operator you can also write and
    var studentMarks = 92
    if (studentMarks >= 90 && studentMarks < 96) {
        println("A")
    }

    // same with Range check
    if (studentMarks in 90..95) {
        println("A")
    }

    // if statement with || operator can also be written or
    var aor = 10
    var bor = 20
    var cor = 30
    if ((bor > aor) || bor > cor) {
        println("b is a winner")

        if (aor != bor) {
            println("a and b are different")
        }
    }

    // if statement as expression
    var studentMark = 95
    var grade = if (studentMark >= 90) {
        "A"
    } else if (studentMark >= 80) {
        "B"
    } else if (studentMark >= 70) {
        "C"
    } else if (studentMark >= 60) {
        "D"
    } else {
        "F"
    }
    println("Student achieved: $grade")

    // when expression
    when (2) {
        1 -> println("Monday")
        2 -> println("Tuesday")
        3 -> println("Wednesday")
        4 -> println("Thursday")
        5 -> println("Friday")
        6 -> println("Saturday")
        7 -> println("Sunday")
        else -> println("Invalid input")
    }

    // when expression with 2 cases comma separated
    when ("b") {
        "A","a" -> println("Excellent")
        "B","b" -> println("Very Good")
        "C","c" -> println("Nice work")
        "D","d" -> println("OK")
        "E","e" -> println("Hmmm")
        "F","f" -> println("Better luck next time")
        else -> println("Invalid input")
    }

    // Ranges with when
    when ("A") {
        in "A".."E" -> println("You are promoted to the next level")
        "F" -> println("You need hard work")
        else -> println("Invalid input")
    }

    val remarks = when ("A") {
        "A","a" -> "Excellent"
        "B","b" -> "Very Good"
        "C","c" -> "Nice work"
        "D","d" -> "OK"
        "E","e" -> "Hmmm"
        "F","f" -> "Better luck next time"
        else -> "Invalid input"
    }
    println(remarks)
}

fun ifElse() {

    var langName = "C#"
    if (langName == "Kotlin") {
        println("Hello $langName")
    } else {
        println("The name of the language is $langName")
    }

}