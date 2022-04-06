
const val name = "Alex"
const val seconds = 9000

fun agoToTextDay() {

    when (seconds) {
        in (24 * 60 * 60) + 1..(24 * 24 * 60 * 60) -> println("$name\nбыл(а) сегодня")
        in (24 * 24 * 60 * 60) + 1..(24 * 24 * 24 * 60 * 60) ->
            println("$name\nбыл(а) вчера")
        in (24 * 24 * 24 * 60 * 60) + 1..Int.MAX_VALUE -> println("$name\nбыл(а) давно")
    }
}

fun agoToTextHour() {
    val hour = seconds / (60 * 60)

    val x = when {
        hour % 10 == 1 -> "час"
        hour % 100 in 5..20 -> "часов"
        hour % 10 in 2..4 -> "часа"
        else -> "часов"
    }
    when (seconds) {
        in (60 * 60) + 1..24 * 60 * 60 -> println("$name\nбыл(а) $hour $x назад")
    }
}

fun agoToTextMinute() {
    val minute = seconds / 60

    val x = when {
        minute % 10 == 1 -> "минуту"
        minute % 100 in 5..20 -> "минут"
        minute % 10 in 2..4 -> "минуты"
        else -> "минут"
    }
    when (seconds) {
        in 0..60 -> println("$name\nбыл(а) Только что")
        in 61..(60 * 60) -> println("$name\nбыл(а) $minute $x назад")
    }
}

fun main() {
    agoToTextDay()
    agoToTextHour()
    agoToTextMinute()
}