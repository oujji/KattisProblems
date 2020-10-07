fun main(args: Array<String>) {
    var variables = readLine()!!.split(" ")

    val bobAge = variables[0].toInt()
    val bobRetireAge = variables[1].toInt()
    val bobAmountToBeSavedEachYear = variables[2].toInt()
    val aliceAge = variables[3].toInt()
    val aliceAmountToBeSavedEachYear = variables[4].toInt()

    var diffInBobAges = bobRetireAge - bobAge
    var bobTotalSavings = diffInBobAges * bobAmountToBeSavedEachYear

    var yearsForAlice = 0
    var aliceTotalSavings = 0

    while(aliceTotalSavings <= bobTotalSavings)
    {
        aliceTotalSavings += (aliceAmountToBeSavedEachYear)
        yearsForAlice++
    }
    println(yearsForAlice + aliceAge)
}
