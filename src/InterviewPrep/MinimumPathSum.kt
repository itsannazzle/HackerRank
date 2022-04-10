package InterviewPrep

class MinimumPathSum {
    fun minimumPathSum(matrix: Array<IntArray>): Int {
        // TODO, find a path from top left to bottom right which minimizes the sum of all numbers along its path, and return the sum
        // below is stub
        if (matrix.isEmpty() || matrix[0].isEmpty()) return 0
        //get the size of the first array child
        val temp = Array(matrix.size) { IntArray(matrix[0].size) }
        val b = arrayOf(
                intArrayOf(1,2,3,4),
                intArrayOf(5,6,7,8),
                intArrayOf(8,10,11,12)
            )
           // IntArray(4)

        //println(matrix.size)
//        println(matrix[0].size)
        for (i in 1 until matrix.size) {
            temp[i][0] = temp[i - 1][0] + matrix[i][0]
            println(temp[i][0])
        }
        for (j in 1 until matrix[0].size) {
            temp[0][j] = temp[0][j - 1] + matrix[0][j]
        }
        for (i in 1 until matrix.size) {
            for (j in 1 until matrix[0].size) {
                temp[i][j] = Math.min(temp[i - 1][j], temp[i][j - 1]) + matrix[i][j]
            }
        }
        return temp[matrix.size - 1][matrix[0].size - 1]
    }
}

fun main(){
    val pathSum = MinimumPathSum()
    val number = pathSum.minimumPathSum(arrayOf(
        intArrayOf(1, 2, 1, 9),
        intArrayOf(1, 5, 1, 1),
        intArrayOf(4, 2, 1, 1)))
    //println(number)
}