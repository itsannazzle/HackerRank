package OneMonthPrep

import java.text.DecimalFormat

class PlusMinus {
    fun plusMinus(arr: Array<Int>)
    {
        var positiveNumber = 0
        var negativeNumber = 0
        var zeroNumber = 0

        for (i in arr)
        {
            when
            {
                i < 0 -> negativeNumber +=1
                i > 0 -> positiveNumber +=1
                i == 0 -> zeroNumber +=1
            }
        }

        //could be simplify but idk how?
        println(DecimalFormat("#,##0.000000").format(positiveNumber/arr.size.toDouble()))
        println(DecimalFormat("#,##0.000000").format(negativeNumber/arr.size.toDouble()))
        println(DecimalFormat("#,##0.000000").format(zeroNumber/arr.size.toDouble()))

    }

    fun findInt(arr : Array<Int>) : Int
    {
        val sortedInt = arr.sorted()
        println(sortedInt)
        var temp = 0
        var toReturn = 0
//        for (i in sortedInt.indices)
//        {
//            temp  = arr[i] +1
//            if (arr[i] )
//            {
//                toReturn = temp
//            }
//        }
        return toReturn
    }

    fun selisih1(arr: Array<Int>) : Boolean
    {
        var toRestun : Boolean = true
        val soredArr = arr.sorted()
        println(soredArr)
        for (i in soredArr.indices)
        {
            if (i != arr.size-1)
            {
                println("a ${soredArr[i+1]}")
                println("b ${soredArr[i]}")
                if((soredArr[i+1] - soredArr[i]) == 1)
                {
                    toRestun = true
                    break
                } else
                {
                    toRestun = false
                }
            }

        }
        return toRestun
    }

    fun returnSingleNumber(intNumber : Int) : Int
    {
        val stringNumber = intNumber.toString()

        val temp = mutableListOf<Char>()
        var removedFive = false
        var str = ""

        for (i in stringNumber.indices)
        {
            removedFive = (stringNumber[i] == '5' && stringNumber[i-1] == '-')

            if (!removedFive)
            {
                if(stringNumber[i] == '5') removedFive = true else str += stringNumber[i]
            }
            else {
                str += stringNumber[i]
            }
        }

        println(str)

        return 0
    }

    fun shuffeld(A : Int, B: Int, C : Int) {
        val a = "a"
        val b = "b"
        val c = "c"
        var str = ""
        a.repeat(A)
        str = a.repeat(A)+b.repeat(B)+c.repeat(C)
        println(str)
        val shufld = str.toList().shuffled()
        var toReturn = ""
        for (s in shufld)
        {
            toReturn += s
        }
        println(toReturn)
    }
}

fun main()
{
    val plusMinus = PlusMinus()
    val intArray = arrayOf(11, 1, 8, 12, 14)
//    plusMinus.plusMinus(intArray)
//    println(plusMinus.findInt(intArray))
    //println(plusMinus.selisih1(intArray))
    plusMinus.returnSingleNumber(-5000)
//    val str =  "aaabbbccc"
//    println(str.toList().shuffled())
//    val a = "a"
//    println(a.repeat(6))
//    plusMinus.shuffeld(6,6,6)
}