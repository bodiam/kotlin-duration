import duration.*
import java.time.LocalDate.now
import duration.hours as hour
import duration.hours
import duration.minutes as minute
import duration.minutes as minutes
import duration.seconds as second
import duration.seconds as seconds

fun main() {

    val delay = now() - 1.hours + 2.seconds

    val totalDuration = 1.hour - 30.minutes + 1.second
    println(totalDuration)

    val longerThan = 1.minute > 60.seconds
    println(longerThan)

    val times = 1.hour * 5
    println(times)

    val div = 1.hour / 5
    println(div)

    val test = 1.nanos * 5
    println(test)

    val fiveSeconds = 1.seconds * 5
    println(fiveSeconds)

    val thousandMillis = 1.millis * 1000
    println(thousandMillis)

    val x = 11.minutes
    if(x in 1.minutes..10.minutes) {
        println("OK")
    } else {
        println("NOT OK")
    }
}