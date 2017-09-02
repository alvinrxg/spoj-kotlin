import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args: Array<String>) {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    reader.readLines().drop(1).forEach {
        val (x, y) = it.split(" ").map { it.toInt() }
        if (x == y || x == y + 2) {
            println(x + y - y % 2)
        } else {
            println("No Number")
        }
    }
}