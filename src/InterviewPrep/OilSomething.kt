package InterviewPrep

class OilSomething {
    fun collectOil(height: IntArray): Int {
        var result = 0
        var leftMax = 0
        var rightMax = 0
        var lo = 0
        var hi: Int = height.size-1

        while (lo <= hi) {
            if (height[lo] < height[hi]) {

                if (height[lo] > leftMax){
                    leftMax = height[lo]
                } else
                    result += leftMax - height[lo]
                lo++

            } else {
                if (height[hi] > rightMax){
                    rightMax = height[hi]
                } else
                    result += rightMax - height[hi]
                hi--
            }
        }
        return result;
    }
}

fun main(){
    val oilSomething = OilSomething()
    println("result : "+oilSomething.collectOil(intArrayOf(0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1)))
}