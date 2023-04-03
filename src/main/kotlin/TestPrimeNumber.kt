import Junit.primeNumberChecker
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import org.junit.runners.Parameterized.Parameters
  
class TestPrimeNumber {
@RunWith(Parameterized::class)
class PrimeNumberCheckerTest(private val numeroEntree: Int, private val resultatAttendu: Boolean) {
    private lateinit var primeNumberChecker: primeNumberChecker

    @Before
    fun initialize() {
        primeNumberChecker = primeNumberChecker()
    }

    @Test
    fun testPrimeNumberChecker() {
        println("Nombre paramétré est : $numeroEntree")
        assertEquals(resultatAttendu, primeNumberChecker.validate(numeroEntree))
    }

    companion object {
        @JvmStatic
        @Parameters
        fun primeNumbers(): Collection<Array<Any>> {
            return listOf(
                arrayOf(2, true),
                arrayOf(6, false),
                arrayOf(19, true),
                arrayOf(22, false),
                arrayOf(23, true),
                arrayOf(73, true),
                arrayOf(121, false)
            )
        }
    }
}}
