package InterviewPrep

class Permutation {

    fun countPermutation(n : Int, r : Int) : Int{
        var divident = 1
        var divider = n-r
        for (i in n.downTo(divider+1)){
            divident *= i

        }
        return divident
    }
}

fun main(){
    val p = Permutation()
//    println("result ${p.countPermutation(6,2)}")
}