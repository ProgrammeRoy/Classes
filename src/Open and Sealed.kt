sealed class Expression

class Num(val number: Double) : Expression()
class Sum(val e1: Expression, val e2: Expression): Expression()
object NotANumber: Expression()

fun eval(expr : Expression): Double = when(expr){
    is Num -> expr.number
    is Sum -> eval(expr.e1) + eval(expr.e2)
    NotANumber -> Double.NaN
}

fun main(args: Array<String>) {
    val num1 = Num(5.5)
    val num2 = Num(10.0)
    println("The sum of 1.1 + 1.1 = ${eval(Sum(Num(1.1),Num(1.1)))}")
    println("The sum of ${num1.number} and ${num2.number} is ${eval(Sum(num1, num2))}, other sum = ${eval(Sum(Num(2.0),Num(3.1)))} ")
    println("The sum of (${num1.number} + ${num2.number}) + (2.0 + 3.1) = ${eval(Sum(Sum(num1, num2),Sum(Num(2.0),Num(3.1))))}")

}