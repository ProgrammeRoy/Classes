class Cancion(var autor: String?, var titulo: String?){
    var tamaño: Int? = null
    var añoPublic: Int? = null

    constructor(autor: String, titulo: String, tamaño: Int): this(autor,titulo){
        this.tamaño = tamaño
    }

    constructor(autor: String, titulo: String, tamaño: Int, añoPublic: Int) : this(autor, titulo, tamaño){
        this.añoPublic = añoPublic
    }

    fun print(){
        if (!titulo.isNullOrEmpty()){
            println("Titulo: $titulo")
        }
        if (!autor.isNullOrEmpty()){
            println("Autor: $autor")
        }
        if (tamaño != null){
            println("Tamaño: $tamaño")
        }
        if (añoPublic != null){
            println("AñoPuclicacion: $añoPublic")

        }
        println()
    }
}

class program(){
    var name: String? = null
    var release: Int? = null
    var lastUpdate: Int? = null
}

fun main(args: Array<String>){
    val cancion1 = Cancion("Charles","Song")
    cancion1.tamaño = 10
    cancion1.añoPublic = 5
    cancion1.print()

    val cancion2 = Cancion("DDJ", "Dance", 14)
    cancion2.print()

    val cancion3 = Cancion("DDJ", "Dance", 14, 2)
    cancion3.print()
}