class StairCase {
    fun climbStairs(n: Int): Long {
        // TODO, return in how many distinct ways can you climb to the top. Each time you can either climb 1 or 2 steps.
        // 1 <= n < 90
        return count(n + 1);
    }

    fun count(n: Int): Long {
        var result = 0L
        //println("n $n")
        if (n <= 1) {
            result = n.toLong()
            //println(" if ${n.toLong()}")
        } else {
            result = count(n - 1) + count(n - 2)
            //println("else ${count(n - 1) + count(n - 2)}")
        }
        return result
    }

    /*fun tryingRecurcive(n : Int) : Int {
        var waysToClimb = 0
        with(n) {
            val twoStep = this % 2
            var twoPlusOneStep = this % 3
            var leftOverFrom2 = 0
            var leftOverFrom3 = 0
            leftOverFrom2 = this % 2
            leftOverFrom3 = this % 3
            if (twoStep == 0) {
                waysToClimb += 1
            } else {
                waysToClimb += 1
                leftOverFrom2 = twoStep
            }

            if (twoPlusOneStep == 0){
                waysToClimb +=1
            } else {
                waysToClimb +=1
                leftOverFrom3 = twoPlusOneStep
            }

            tryingRecurcive(leftOverFrom2)
           // tryingRecurcive(leftOverFrom3)
        }
        return waysToClimb
    }*/
}

fun main() {
    val stairCase = StairCase()
    //stairCase.tryingRecurcive(23)
    println("result ${stairCase.climbStairs(5)}")
    //println(25%3)
}

    //print(stairCase.climbStairs(20))
//    println(33%2)
//    var waysToClimb = 0
//    with(23){
//        var twoStep = this % 2
//        var twoPlusOneStep = this % 3
//        var leftOverFrom2 = 0
//        var leftOverFrom3 = 0
//        leftOverFrom2 = this % 2
//        leftOverFrom3 = this % 3
//        if (twoStep == 0) {
//            waysToClimb +=1
//        } else {
//            waysToClimb +=1
//            leftOverFrom2 = twoStep
//        }
//
//        println(leftOverFrom2)
////        if (this % 3 == 0) waysToClimb +=1
////        if (this %1 == 0) waysToClimb +=1
//    }
//    println(waysToClimb)
