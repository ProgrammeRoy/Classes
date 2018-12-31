class Person1{
    var firstname : String = "Roy"
    var lastname : String = "Martinez"
}

class Person1Variable(var firstname: String ){
    var lastname : String? = null
    constructor(firstname: String, lastname: String) : this(firstname){
        this.lastname = lastname
    }
}

class Person2Variable(var firstName : String?, var lastName : String?){
    var firtname = firstName
    var lastname = lastName
}

class PersonOnlyConstructor(){
    var firstname : String = ""
    var lastName : String = ""
    constructor(firstname : String, lastName: String): this(){
        this.firstname = firstname
        this.lastName = lastName
    }
}


fun main(args: Array<String>){
    val person1 = Person1()
    println("Firstname = ${person1.firstname}, Lastname = ${person1.lastname}")

    val person1Variable = Person1Variable("Jonhy")
    println("Firstname = ${person1Variable.firstname}")

    val person1Variable2 = Person1Variable("Jhony", "Guzman")
    println("Firstname = ${person1Variable2.firstname}, Lastname = ${person1Variable2.lastname}")

    val person2Variable = Person2Variable("Brian", "Adams")
    println("Firstname = ${person2Variable.firstName}, Lastname = ${person2Variable.lastName}")

    val personOnlyConstructor = PersonOnlyConstructor()
    personOnlyConstructor.firstname = "John"
    personOnlyConstructor.lastName = "Odor"
    println("Firstname = ${personOnlyConstructor.firstname}, Lastname = ${personOnlyConstructor.lastName}")
}