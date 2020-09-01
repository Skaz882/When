fun main() {
    val num = 4
    val numString: String

    numString = when (num){
        1 -> "un"
        2 -> "deux"
        3 -> "trois"
        4 -> "quatre"
        5 -> "cinq"
        6 -> "six"
        7 -> "sept"
        8 -> "huit"
        9 -> "neuf"
        10 -> "dix"
        !in 1..10 -> "Out of Range"
        else -> "Unknown"
    }

    println("The number is $numString")
}