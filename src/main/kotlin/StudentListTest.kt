package Junit

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.Util.println
import org.junit.After
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class StudentListTest {
    lateinit var list:StudentList
    @Before
    fun setUp(){
        list = StudentList()
    }
    @After
    fun tearDown(){
        println("After")
    }

    @Test
    fun testAdd() {
        list.add("Ali")
        list.add("Amal")
        list.add("Kamal")
        list.add("Amine")
        assertEquals("Ajout de 4 étudiants à la liste", 4, list.sizeOfStudents())
    }

    @Test
    fun testRemove() {
        list.add("Fatima")
        list.add("Amine")
        list.removee("Amine")
        assertEquals("Suppression d'un étudiant de la liste", 1, list.sizeOfStudents())
    }

    @Test
    fun removeAll() {
        list.removeeAll()
    }
}