interface Animal{
    fun eat()
    val numLegs: Int
}

class Dog: Animal {
    override fun eat() {
        println("Dog eating loudly")
    }
    override val numLegs: Int = 4
}

class Cat: Animal {
    override fun eat() {
        println("Cat eating softly")
    }
    override val numLegs: Int = 4
    fun meow(){
        println("Meow, Meow")
    }
}

fun main(args: Array<String>) {
    val dog = Dog()
    val cat = Cat()

    dog.eat()
    cat.eat()
    cat.meow()
}