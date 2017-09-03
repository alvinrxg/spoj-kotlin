import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args: Array<String>) {
    fun Int.printOut() = println(this)

    val reader = BufferedReader(InputStreamReader(System.`in`))
    reader.readLines().map { it.toInt() }.takeWhile { it != 0 }.forEach {
        (1..it).fold(0) { result, v ->
            result + v * v
        }.printOut()
    }
}
