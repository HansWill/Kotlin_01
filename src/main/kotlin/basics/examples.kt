package basics


fun main () {

    val list = listOf<String>("5.0", "eins", "1", "2", "3", "4")

    if (list.isNotEmpty()) {
        for (argument in list) {
            val input = argument.toIntOrNull()
            input?.let { println(square(it)) } ?: println("Ganze Zahlen bitte")
        }
    }
    else {
        println("Bitte mindestens eine Zahl als Parameter angeben")
    }
}


fun square(i: Int) : Int = i * i

