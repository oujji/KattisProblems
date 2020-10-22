fun main(args: Array<String>) {
    var input = readLine()
    var numbers = input!!.split(' ')
    val y = numbers[1].toString().toInt()
    if(y % 2 == 0)
    {
        println("possible")
    }
    else
    {
        println("impossible")
    }
}
