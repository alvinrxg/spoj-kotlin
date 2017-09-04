import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args: Array<String>) {
    fun Char.printOut() = print(this)

    val reader = BufferedReader(InputStreamReader(System.`in`))
    var column = reader.readLine().toInt()
    while (column != 0) {
        val line = reader.readLine()
        val rows = line.length / column

        val mutableList = mutableListOf<String>()
        (0..(rows - 1)).forEach {
            when (it % 2) {
                0 -> mutableList.add(line.substring(it * column, (it + 1) * column))
                else -> mutableList.add(line.substring(it * column, (it + 1) * column).reversed())
            }
        }
        (0..(column - 1)).forEach {
            val c = it
            (0..(rows - 1)).forEach {
                mutableList[it][c].printOut()
            }
        }

        println()

        column = reader.readLine().toInt()
    }

}