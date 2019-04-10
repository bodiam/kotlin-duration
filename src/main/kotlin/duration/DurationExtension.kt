package duration

import java.time.Duration


val Int.nanos: Duration
    get() {
        return Duration.ofNanos(this.toLong())
    }

val Int.millis: Duration
    get() {
        return Duration.ofMillis(this.toLong())
    }

val Int.seconds: Duration
    get() {
        return Duration.ofSeconds(this.toLong())
    }

val Int.minutes: Duration
    get() {
        return Duration.ofMinutes(this.toLong())
    }

val Int.hours: Duration
    get() {
        return Duration.ofHours(this.toLong())
    }

val Int.days: Duration
    get() {
        return Duration.ofDays(this.toLong())
    }


operator fun Duration.times(i: Int): Duration {
    return Duration.ofNanos(this.nano.toLong() * i) + Duration.ofSeconds(this.seconds * i)
}

operator fun Duration.div(i: Int): Duration {
    return Duration.ofNanos(this.nano.toLong() / i) + Duration.ofSeconds(this.seconds / i)
}