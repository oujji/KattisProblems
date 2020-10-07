fun main(args: Array<String>) {
    var number = readLine()!!
    var sumOfDigits = 0
    var fullNumber = number.toInt()

    sumOfDigits = getSumOfDigits(number)

    if(number.toInt() % sumOfDigits == 0)
    {
        println(fullNumber)
    }
    else
    {
        fullNumber++

        while (fullNumber % getSumOfDigits(fullNumber.toString()) != 0)
        {
               fullNumber++
        }
        println(fullNumber)
    }
}

fun getSumOfDigits(num : String) : Int
{
    var sumOfDigits = 0
    num.forEach {
        sumOfDigits += it.toString().toInt()
    }
    return sumOfDigits
}
