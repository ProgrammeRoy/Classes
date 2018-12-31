class Country private constructor(){
    var name: String =""
    companion object{
        fun generateCountry(): Country{
            val country = Country()
            country.name = "Peru"
            return country
        }
    }
}

fun main(args: Array<String>){
    var country = Country.generateCountry()
    println(country.name)
}