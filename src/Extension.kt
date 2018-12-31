fun String.firstElement(): Char = this.get(0)
fun String.lastEment(): Char = this.get(length-1)
fun String.middleElement(): String {
    if (this.isNullOrEmpty()){
        return "El contenido esta vacio o nulo"
    } else{
        if (this.length == 1 || this.length == 2){
            return this
        }else{
            if (this.length%2==1){
                var middle = this.get(length/2).toString()
                return middle
            }else{
                var middle =this.get((length/2)-1).toString() + this.get(length/2).toString()
                return middle
            }
        }
    }
}


fun main(args: Array<String>) {
    var title = "abcdefgh"
    //println("The last character is: ${title.get(0)}")
    //println("First Element: ${title.firstElement()}")
    //println("Last Element: ${title.lastEment()}")
    println("Middle element: ${title.middleElement()}")

}