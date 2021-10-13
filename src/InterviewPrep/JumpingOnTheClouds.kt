package InterviewPrep

class JumpingOnTheClouds {
    /*Clue
    * 1.A mobile game with consecutive(berurutan) numbered cloud
    * 2.Some clouds are thundered and Columbus
    * 3.Player can jump on any cumulus cloud
    * that have a number that's equal to the number of the current cloud plus 1 or 2
    * 4.Player must avoid thundered clouds
    * 5.The number of each cloud is its index
    * -- Given number of array, 0 = safe, 1 = avoid
    * */
//    Breakdown
    /*Keypoint takes :
    * 1. Check the value of plus 1 or plus 2 index from the pointer (clue number 3)
    * 2. if the value is 1 then avoid
    *
    * */

    fun jumpingOnClouds(c: Array<Int>): Int {
        // Write your code here
        var jump = 0
        var cloud = 0
        while (cloud < c.size-1) {
                if (cloud< c.size-2 && c[cloud + 2] != 1){
                    jump++
                    cloud +=2
                //print(jump)
            } else if (c[cloud] == 0 && c[cloud+1] == 0){
                jump++
                cloud++
            } else{
                jump++
            }
        }
        return jump
    }
}

fun main() {
    val jumpingOnTheClouds = JumpingOnTheClouds()
    val n = readLine()!!.trim().toInt()
    val c = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
    val result = jumpingOnTheClouds.jumpingOnClouds(c)

    println(result)
}
