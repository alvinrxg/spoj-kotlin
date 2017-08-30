/**
 * Created by alvin on 30.08.2017.
 */
import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args: Array<String>) {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    reader.useLines {
        it.drop(1).forEach {
            val startEnd = it.split(" ")
            val start = startEnd[0].toInt()
            val end = startEnd[1].toInt()
            (start..end).filter { isPrime(it) }
                    .forEach(::println)
            println()
        }
    }
}

fun isPrime(value: Int): Boolean {
    return if (value < 2) {
        false
    } else {
        (2..Math.sqrt(value.toDouble()).toInt()).all { i -> value % i != 0 }
    }
}
