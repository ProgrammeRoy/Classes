class Student1 private constructor(){
    var firstname: String? = null
    var lastname: String? = null
    companion object {
        fun loadStudent(jsonText: String) : Student1 {

            val student = Student1()
            student.firstname = "FirstName"
            student.lastname = "LastName"
            return student
        }
    }

}

fun main(args: Array<String>) {
    val student = Student1.loadStudent("Home")



}

