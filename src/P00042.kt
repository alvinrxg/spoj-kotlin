/**
 * Created by alvin on 30.08.2017.
 */

import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args: Array<String>) {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    reader.readLines().drop(1)
            .forEach {
                println(it.split(" ").map { it.reversed() }
                        .map { it.toInt() }
                        .sum()
                        .toString()
                        .reversed()
                        .toInt()
                )
            }
}