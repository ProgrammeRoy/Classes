interface Shape{
    var width: Int
    var height: Int
    fun draw()
}

class Circle(override var width: Int, override var height: Int): Shape{
    override fun draw() {
        println("Drawing a circle")
    }
}
class Line(override var width: Int, override var height: Int): Shape{
    override fun draw() {
        println("Drawing a Line")
    }
}
fun printShape(shape: Shape){
    shape.draw()
}

fun main(args: Array<String>) {
    var circle = Circle(10,5)
    var line = Line(3,5)
    circle.draw()
    line.draw()
}