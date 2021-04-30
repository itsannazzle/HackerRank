
fun main(args:Array<String>){
    var n = readLine()!!.trim().toInt()
    val arr = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()
    plusMinus(arr)
}

fun plusMinus(arr: Array<Int>){
    var plus  = 0f
    var minus  = 0f
    var zero = 0f
    for (arrays in arr){
        if (arrays > 0){
            plus++
        } else if (arrays <0){
            minus++
        } else zero++

    }
    println("this is plus $plus")
    println("this is minus $minus")
    println("this is zero $zero")

    println("array size ${arr.size}")
    println(plus.div(arr.size))
    println(minus.div(arr.size))
    println(zero.div(arr.size))

}