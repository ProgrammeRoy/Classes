fun main(args: Array<String>) {
    class Grade(var letter: Char, var points: Double, var credits: Double)

    open class Person(var firstName: String, var lastName: String)

    open class Student(firstName: String, lastName: String, var grades: ArrayList<Grade> = ArrayList()) : Person(firstName, lastName){
        open fun addGrade(grade: Grade){

            grades.add(grade)
        }
    }
    val john = Person("Jonny", "Appleseed")
    val jane = Student("Jane", "Appleseed")

    println(john.firstName)
    println(jane.firstName)

    val history = Grade('B', 9.0, 3.0 )
    jane.addGrade(history)

    open class BandMember(firstName: String, lastName: String) : Student(firstName, lastName){
        open var minimumPracticeTime = 2
    }

    class OboePlayer(firstName: String, lastName: String) : BandMember(firstName, lastName){
        override var minimumPracticeTime: Int
            get() {
                return super.minimumPracticeTime*2
            }
            set(value) {
                super.minimumPracticeTime = value/2
            }
    }

    fun phoneBookName(person: Person) : String{
        return "${person.lastName}, ${person.firstName}"
    }

    val person =  Person(firstName = "Johnny",lastName = "Appleseed")
    val oboePlayer = OboePlayer("Jane", "Appleseed")

    println(phoneBookName(person))
    println(phoneBookName(oboePlayer))

    var hallMonitor = Student("jill", "Bananapeel")
    println(hallMonitor.firstName)
    hallMonitor = oboePlayer
    println(hallMonitor.firstName)

    (oboePlayer as BandMember).minimumPracticeTime = 4
    (hallMonitor as? BandMember)?.let {
        println("This hall monitor is a band member and practices at least ${hallMonitor.minimumPracticeTime} hours per week")
    }

    fun afterClassActivity(student: Student) : String{
        return "Goes Home!"
    }
    fun afterClassActivity(student: BandMember) : String{
        return "Goes to practice!"
    }
    println(afterClassActivity(oboePlayer))
    println(afterClassActivity(oboePlayer as Student))

    class StudentAthlete(firstName: String, lastName: String) : Student(firstName, lastName){
        var failedClasses = ArrayList<Grade>()

        override fun addGrade(grade: Grade) {
            super.addGrade(grade)

            if (grade.letter == 'F'){
                failedClasses.add(grade)
            }
        }

        var isEligible: Boolean = true
            get(){
                return failedClasses.size < 3
            }
    }

    //Single Responsibility

    //Type safety

    //Share base classes

    //Extensibility

    //Identity





}