fun main(args: Array<String>){
    class Person{
        init {
            println("Init 1")
        }
        init {
            println("Init 2")
        }
    }
    val person = Person()

    class Person2(var firstname: String, var lastname: String){
        var fullname: String
        init {
            fullname = firstname+" "+lastname
        }
    }
    val person2 = Person2("Alberto", "Marquez")
    println("Fullname : ${person2.fullname}")


}