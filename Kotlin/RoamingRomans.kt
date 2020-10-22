import java.text.DecimalFormat

fun main(args: Array<String>) { println(DecimalFormat("#").format((1000 * (5280.0/4854.0)) * readLine()!!.toFloat())) }
