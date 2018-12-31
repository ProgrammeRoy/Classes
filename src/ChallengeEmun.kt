enum class Plataform{
    ANDROID,
    IOS
}

fun programar(program: Plataform, activo: Boolean){
    when(program){
        Plataform.ANDROID ->
            if (activo){
                println("Programming $program in Kotlin")
            }
        Plataform.IOS -> println("Programming $program in Swift")
    }
}

fun main(args: Array<String>) {
    programar(Plataform.ANDROID, true)
}