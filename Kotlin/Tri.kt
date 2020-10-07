fun main(args: Array<String>) {

        var numbers = readLine()!!.split(" ")

        var num1 = numbers[0].toInt()
        var num2 = numbers[1].toInt()
        var num3 = numbers[2].toInt()

        var plusSign = "+"
        var minusSign = "-"
        var multiplySign = "*"
        var divideSign = "/"
        var equalsSign = "="
        var tempSign = ""

        var maxNumber = 0
        var leastNumber = 0
        var outputString = ""
        var position1 = 0
        var position2 = 0

        if (num1 > num2)
        {
            maxNumber = num1
            leastNumber = num2
        }
        else
        {
            maxNumber = num2
            leastNumber = num1
        }

        if(maxNumber + leastNumber == num3)
        {

            if(maxNumber == num1)
            {
                position1 = maxNumber
                position2 = leastNumber
            }
            else
            {
                position1 = leastNumber
                position2 = maxNumber
            }
            if(num1 + num2 != num3)
            {
                tempSign = equalsSign
                equalsSign = plusSign
                plusSign = tempSign
            }
            outputString = "$position1$plusSign$position2$equalsSign$num3"
        }
        else if(maxNumber - leastNumber == num3)
        {
            if(maxNumber == num1)
            {
                position1 = maxNumber
                position2 = leastNumber
            }
            else
            {
                position1 = leastNumber
                position2 = maxNumber
            }

            if(num1 - num2 != num3)
            {
                tempSign = equalsSign
                equalsSign = minusSign
                minusSign = tempSign
            }
            outputString = "$position1$minusSign$position2$equalsSign$num3"
        }
        else if(maxNumber * leastNumber == num3)
        {
            if(maxNumber == num1)
            {
                position1 = maxNumber
                position2 = leastNumber
            }
            else
            {
                position1 = leastNumber
                position2 = maxNumber
            }

            if(num1 * num2 != num3)
            {
                tempSign = equalsSign
                equalsSign = multiplySign
                multiplySign = tempSign
            }
            outputString = "$position1$multiplySign$position2$equalsSign$num3"
        }
        else if((maxNumber / leastNumber) == num3 && (maxNumber % leastNumber == 0))
        {
            if(maxNumber == num1)
            {
                position1 = maxNumber
                position2 = leastNumber
            }
            else
            {
                position1 = leastNumber
                position2 = maxNumber
            }

            if(num1 / num2 != num3)
            {
                tempSign = equalsSign
                equalsSign = divideSign
                divideSign = tempSign
            }
            outputString = "$position1$divideSign$position2$equalsSign$num3"
        }

    println(outputString)
}
