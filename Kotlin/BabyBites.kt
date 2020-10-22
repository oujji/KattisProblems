fun main(args: Array<String>) {
    readLine()!!.toInt()
    var input = readLine()
    var count = 0
    var possiblyFishy = false
    var numberMap = mutableMapOf<Int,Int>()
    var thingsSaid = input!!.split(' ')

    for(i in thingsSaid)
    {
        count++
        if(i.toIntOrNull() != null) // If numerical
        {
            numberMap.put(count,i.toInt())
        }
        else
        {
            numberMap.put(count,count)
        }
    }

    for (i in numberMap.keys)
    {
        if(i != numberMap.getValue(i))
        {
            possiblyFishy = true
        }
    }
    if(possiblyFishy) println("something is fishy") else println("makes sense")
}
