package Junit

class StudentList {
    private var students = mutableListOf<String>()
    fun removee(name:String){
        students.remove(name)
    }
    fun add(name:String){
        students.add(name)
    }
    fun removeeAll(){
        students.clear()
    }
    fun sizeOfStudents():Int{
       return students.size
    }
}


