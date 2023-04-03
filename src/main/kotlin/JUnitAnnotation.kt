package Junit

import org.junit.*

class JUnitAnnotation {
    companion object{
        @BeforeClass
        fun beforeclass(){
            println("before class")
        }
        @AfterClass
        fun afterclass(){
            println("after class")
        }
        @Before
        fun before(){
            println("before ")
        }
        @After
        fun after(){
            println(" after")
        }
        @Test
        fun test(){
            println("test")
        }
        @Ignore
        fun ignoretest(){
            println("ignore test")
        }
    }
}