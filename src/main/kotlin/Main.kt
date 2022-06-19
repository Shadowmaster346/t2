fun main() {
    var b: Int = (1..100).random()
    println("Угадай мое число от 1 до 100")
    var jkf = readLine()?.toInt()
    if (jkf != null) {
        if (jkf >= 101) {
            println("Слишком большое число!!!")
        } else {
//      println(b)
            if (jkf == b) {
                println("You win! Мое число $b")
            } else {
                println("You lose! Мое число $b")
            }
        }
    }
}