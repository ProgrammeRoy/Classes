fun main(args: Array<String>) {

    data class Podcast(val title: String, val description: String, val url: String)

    val podcast = Podcast("Bohemia", "Travel around the world", "https://travel.com")
    val podcast2 = podcast.copy(title = "Rapshody")

    println(podcast2.toString())

    val (title, description, url) = podcast2

    println("Title: $title, Description: $description, Url: $url")

}
