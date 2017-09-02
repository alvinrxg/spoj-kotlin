import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args: Array<String>) {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    reader.readLines().takeWhile { it.split(" ").any { s -> s.toInt() != 0 } }
            .forEach {
                val (a, b, c) = it.split(" ").map { it.toInt() }
                if (a + c == b * 2) {
                    println("AP " + (c + b - a))
                } else {
                    println("GP " + (c * b / a))
                }
            }
}