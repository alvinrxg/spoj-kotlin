import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args: Array<String>) {
    fun Int.printOut() = println(this)

    val reader = BufferedReader(InputStreamReader(System.`in`))
    var count = reader.readLine().toInt()
    while (count > 0) {
        reader.readLine()   // drop
        val men = reader.readLine().split(" ").map { it.toInt() }.sorted()
        reader.readLine().split(" ").map { it.toInt() }.sorted()
                .foldIndexed(0) { index, result, wm ->
                    result + wm * men[index]
                }.printOut()
        count--
    }
}