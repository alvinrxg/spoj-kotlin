import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args: Array<String>) {
    fun Int.printOut() = println(this)

    val reader = BufferedReader(InputStreamReader(System.`in`))
    val list = mutableListOf<Int>()

    var count = reader.readLine().toInt()
    while (count != -1) {
        list.clear()
        var index = 0
        while (index < count) {
            list.add(reader.readLine().toInt())
            index++
        }

        if (list.sum() % count == 0) {
            val average = list.average().toInt()
            list.filter { i -> i > average }.map { i -> i - average }.sum().printOut()
        } else {
            (-1).printOut()
        }

        count = reader.readLine().toInt()
    }
}
