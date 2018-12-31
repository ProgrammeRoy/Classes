/**
 * Given the Student data class below, create a StudentRegistry
 * singleton that has a list of students and can add and remove a
 * student from that list.
 *
 */
data class Student(val firstName: String, val lastName: String)

object StudentRegistry{
    val allStudent = mutableListOf<Student>()

    fun addStudent(student: Student){
        allStudent.add(student)
    }
    fun removeStudent(student: Student){
        allStudent.remove(student)
    }
}

/**
 * Add 2 students to the registry and then print out the list
 */
// Add main function and print out the students

fun main(args: Array<String>) {

    val steve = Student("Steven", "Miller")
    val john = Student("John", "Smith")
    StudentRegistry.addStudent(steve)
    StudentRegistry.addStudent(john)
    StudentRegistry.allStudent.forEach{
        println(it.firstName + " " + it.lastName)
    }

}