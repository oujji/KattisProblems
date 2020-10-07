fun main(args: Array<String>) {
    val width = readLine()!!.toInt()
    val pieces = readLine()!!.toInt()
    var totalArea = 0

    for(piece in 1..pieces)
    {
        val pair = readLine()!!.split(" ")

        var width = pair[0].toInt()
        var length = pair[1].toInt()

        totalArea += (width * length)
    }
    println( totalArea / width)
}
