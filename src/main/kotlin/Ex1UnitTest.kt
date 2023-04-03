package Junit

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.Util.println
import org.junit.*
import org.junit.Assert.assertEquals

class Ex1UnitTest {
    @Before
    fun setUp(){
        println("Before")
    }
    @After
    fun tearDown(){
        println("After")
    }
    @Test
    fun equalString(){
        println("Je suis developpeur Mobile")
       var  str1:String="Je suis developpeur Mobile"
        assertEquals("Je  suis developpeur Mobile",str1)
    }

}