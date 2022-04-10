package InterviewPrep

class FizzBuzz
{
    fun arr(arr : Array<String>) {
        val lisProduct = arr.asList()
        println(lisProduct.sorted())
    }

}

fun main() {
    val product = arrayOf<String>("redShirt","redShirt","redShirt","whitePants","redPants","blackPants","yellowShirt","orangePants","yellowShirt","blackShirt","yellowShirt","blackShirt","zam","zam","zam","zam")
    val randomZZ = arrayOf("a","A","Z","z","z","v","b","c","v","a","b","j")
    val mostItem = randomZZ.groupingBy { it }.eachCount().mapValues { it }.values.sortedBy { it.key }

    println(mostItem)
    println(mostItem.last().key)
//    for (item in product.indices)
//    {
//        mostItem.add(product[item])
//        if (product[item] != mostItem[item]) mostItem.removeAt(item)
//
//    }
//    println(mostItem)
}