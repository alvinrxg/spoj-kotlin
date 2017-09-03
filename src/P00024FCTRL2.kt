/**
 * Created by alvin on 30.08.2017.
 */
import java.io.BufferedReader
import java.io.InputStreamReader
import java.math.BigDecimal

fun main(args: Array<String>) {
    fun BigDecimal.printOut() = println(this)

    val reader = BufferedReader(InputStreamReader(System.`in`))
    reader.readLines().drop(1)
            .forEach {
                (1..it.toInt()).fold(BigDecimal.ONE) { result: BigDecimal, next: Int ->
                    result.multiply(BigDecimal(next))
                }.printOut()
            }
}
