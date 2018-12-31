/*
 ## CLASSES VS STRUCTURES

 Imagine you're writing a movie-viewing application in Kotlin.
 Users can create lists of movies and share those lists with other users.

     Create a `MovieList`  and a `MovieGoer` class

 - `MovieList` - Contains a genre String passed in the constructor
         and an array of movie titles set as a property.
 Create a `print` method that will print all the movies in the list.
 - `MovieGoer` - Add a method `addList(movieList)` which adds the given list
 to a map of `movieList` objects (using the `genre` as a key).
     Add a method `movieListFor(genre) : MovieList?`
         that will return the Nullable `MovieList` for the provided genre.
     Add a method 'addMovie'(genre, movie) that will add a movie to the given genre
 - Create `jane` and `john` users in main and have them create and share lists.
 Have both `jane` and `john` modify the same list and call `print` from both users.
     Are all the changes reflected?
 */
class MovieList(val genre: String){
    private val movies = ArrayList<String>()

    fun addMovie(movie: String){
        movies.add(movie)
    }
    fun print(){
        println("Movie list: ${genre}")
        for (movie in movies){
            println("- $movie")
        }
        println()
    }
}

class MovieGoer{
    private var movieList = HashMap<String, MovieList>()

//    fun addList(list: MovieList){
//        movieList[list.genre] = list
//    }
    fun addGenre(genre: String){
        movieList[genre] = MovieList(genre)
    }
    fun movieListFor(genre: String) : MovieList? {
        return movieList[genre]
    }
    fun addMovie(genre: String, movie: String){
        if (!movieList.containsKey(genre)){
            addGenre(genre)
        }
        movieList[genre]?.addMovie(movie)
    }
}
fun main(args: Array<String>){
    val jane = MovieGoer()
    val john = MovieGoer()
//    val actionList = MovieList("Action")
//
//    jane.addList(actionList)
//    john.addList(actionList)

    jane.addMovie("Action", "Rambo")
    jane.addMovie("Action", "Terminator")
    john.addMovie("Action", "Die hard")

    jane.movieListFor("Action")?.print()
    john.movieListFor("Action")?.print()
}