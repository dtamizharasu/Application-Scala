package com.controlstatements

import scala.collection.immutable.Range

object ForExamples extends App {

  var numbers = Seq(1, 2, 3)
  for (i <- numbers) println(i)
  numbers = numbers :+ 4
  numbers = numbers ++ Seq(5, 7, 8)

  val indices = for (i <- numbers.indices if numbers(i) > 0) yield numbers(i)
  println("Indices Till Last : "+indices)

  val until = for (i <- 0 until numbers.size if numbers(i) > 0) yield numbers(i)
  println("Until Till Last Before: "+until)

  val to = for (i <- 0 to numbers.size - 1 if numbers(i) > 0) yield numbers(i)
  println("To Till Last: "+to)

  var excl = (for (i <- Range(1,10,2)) yield i).toList
  println("Only Even Numbers : " + excl)

  var incl = (for (i <- Range.inclusive(1, 10, 2)) yield i).toList
  println("Only Odd Numbers : " + incl)

  var ranges = for (i <- 10 to(1, -1)) yield i
  println("Numbers On Reverse : " + ranges.toList)

  var num = 3
  while (num >= 0) {
    print(num)
    num -= 1
  }

  val people = List(
    "Bill",
    "Candy",
    "Karen",
    "Leo",
    "Regina"
  )
  people.foreach(println)
  people.foreach(movie=> println(movie))

  val ratings = Map(
    "Lady in the Water"  -> 3.0,
    "Snakes on a Plane"  -> 4.0,
    "You, Me and Dupree" -> 3.5
  )
  for ((name,rating) <- ratings) println(s"Movie: $name, Rating: $rating")
  ratings.foreach {
    case(movie, rating) => println(s"key: $movie, value: $rating")
  }

  val names = List("adam", "david", "frank")
  val ucNames = for (name <- names) yield name.capitalize
  println(ucNames)

  val resNames = for(i <- names.size-1 to(0,-1)) yield names(i)
  println(resNames.toList)

  val even = for(i <- 1 to 10 by 2) yield  i
  println(even.toList)

  
}
