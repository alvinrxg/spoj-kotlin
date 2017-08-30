/**
 * Created by alvin on 30.08.2017.
 */

import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args: Array<String>) {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    reader.useLines {
        it.takeWhile {
            it != 42.toString()
        }.forEach(::println)
    }
}
