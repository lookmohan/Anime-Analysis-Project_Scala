package example

case class Anime(id: Int, name: String, genre: String, episodes: Int, rating: Double)

object Hello extends App {

  val file = scala.io.Source.fromFile("C:/Users/ADMIN/anime-analysis/data/anime.csv")
  val data = file.getLines().drop(1).toList

  val animeList = data.map { line =>
    val cols = line.split(",")
    Anime(
      cols(0).toInt,
      cols(1),
      cols(2),
      cols(3).toInt,
      cols(4).toDouble
    )
  }

  // Total Anime
  println("Total Anime: " + animeList.size)

  // Average Rating
  val avgRating = animeList.map(_.rating).sum / animeList.size
  println("Average Rating: " + avgRating)

  // Highest Rated Anime
  val highest = animeList.maxBy(_.rating)
  println("Highest Rated Anime: " + highest.name)

  // Anime with rating > 8.5
  val above85 = animeList.filter(_.rating > 8.5)
  println("Anime with rating > 8.5: " + above85.map(_.name))

  // Genre-wise Average Rating
  val genreAvg = animeList.groupBy(_.genre).map {
    case (genre, list) =>
      val avg = list.map(_.rating).sum / list.size
      (genre, avg)
  }

  println("\nGenre-wise Average Rating:")
  genreAvg.foreach { case (genre, avg) =>
    println(genre + " -> " + avg)
  }

  // Longest Anime (max episodes)
  val longest = animeList.maxBy(_.episodes)
  println("\nLongest Anime: " + longest.name + " (" + longest.episodes + " episodes)")

  // Anime with episodes > 100
  val longAnime = animeList.filter(_.episodes > 100)
  println("Anime with episodes > 100: " + longAnime.map(_.name).mkString(", "))
}