import java.util.*

fun main(args: Array<String>) {
    val input = readLine()
    var pairsList = mutableListOf<String>()
    var ranklist = mutableListOf<String>()
    var max = 0

    pairsList.addAll(input!!.split(" "))

    pairsList.forEach{
        ranklist.add(it.substring(0,1))
        ranklist.forEach {
            var freq = Collections.frequency(ranklist,it)

            if(freq > max)
            {
                max = freq
            }
        }
    }
    println(max)
}
