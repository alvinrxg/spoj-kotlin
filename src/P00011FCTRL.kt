/**
 * Created by alvin on 30.08.2017.
 */
fun main(args: Array<String>) {
    val count = readLine()!!.toInt()
    for (i in 1..count) {
        val value = readLine()!!.toInt()
        var zeros = 0
        var tmp = value
        while (tmp > 4) {
            val subvar = tmp / 5
            zeros += subvar
            tmp = subvar
        }
        println(zeros)
    }
}
