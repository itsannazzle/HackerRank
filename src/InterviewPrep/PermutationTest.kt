package InterviewPrep

import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class PermutationTest {
    val n = 7
    val r = 3

    @Test
    fun countPermutation() {
        val p = Permutation()
        //given
        val actual = p.countPermutation(n, r)
        val expected = 210
        assertEquals(expected, actual)

    }
    @Test
    fun noteq(){
        val p = Permutation()
        assertNotEquals(1, p.countPermutation(2,1))
    }
}