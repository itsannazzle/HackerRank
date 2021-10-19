package InterviewPrep

class RepeatedString {
    fun repeatedString(s : String, l : Long) : Long {
        /* Clue
        * 1. a string with repeated infinite many times
        * 2. Given an interger n
        * 3. the string length equals to given n
        * 4. count how many a's in the string with n length
        * */

        /*Closure
        * 1. First divide the n to the s length to know how many times the string will be repeated
        * 2. Count how many 'a' contain in a given string
        * 3. Count how many leftover from the divide of l % l.length,
        * 4. Count how many 'a' in a leftover
        * 5. Closure pt.II : we count how many times we will repeat the given string and multiply it with the sum of
        *    'a' in a initial given string,
        *     and then we count how many is the leftover of the repeated string and count the 'a'
        *    finally, we count the sum of multiply and adds the leftover that equals to 'a'
        * */
        val fullRepeats = l.div(s.length)
        println("fullrepeats = $fullRepeats")
        val leftOver = (l % s.length).toInt()
        println("leftover = $leftOver")
        val perString = s.count { it == 'a' }
        println("perString = $perString")
        val remainder = s.take(leftOver).count { it == 'a' }
        println("remainder = $remainder")

        return fullRepeats.times(perString).plus(remainder)
    }
}

fun main(){
    val s = readLine()!!

    val n = readLine()!!.trim().toLong()
    val repeatString = RepeatedString()
    val result = repeatString.repeatedString(s, n)

    println(result)
}