fun main(args: Array<String>) {
    fun Int.printOut() = println(this)

    val input = readLine()!!.toInt()
    (1..Math.sqrt(input.toDouble()).toInt()).sumBy { i -> input / i - i + 1 }.printOut()
}