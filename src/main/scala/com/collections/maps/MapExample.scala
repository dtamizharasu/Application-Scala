package com.collections.maps

import scala.collection.mutable

object MapExample extends App {

  var immutableMap = scala.collection.immutable.Map[String,String]()
  immutableMap += ("Salem" -> "TN")
  var mutableMap = scala.collection.mutable.Map[String,String]()

  var mutableWeakHashMap = scala.collection.mutable.WeakHashMap[String,String]()
  var mutableLinkedListHashMap = scala.collection.mutable.LinkedHashMap[String,String]()
  var mutableHashMap = scala.collection.mutable.HashMap[String,String]()

  var states = mutable.Map("Salem" -> "TN","Namakkal" -> "TN","Erode" -> "TN")
//  states += ("Coimbatore" -> "TN","Tirupur" -> "TN")
  states += ("Coimbatore" -> "TN")
  states ++= Map("Chennai" -> "TN","Tirupur" -> "TN")
  println(states)

  states -= ("Coimbatore")
  println(states)
  states --= List("Tirupur")
  println(states)

  var ratings = Map(
    "Lady in the Water" -> 3.0,
    "Snakes on a Plane" -> 4.0,
    "You, Me and Dupree" -> 3.5
  )
  ratings += ("Taxi" -> 4.1)
  val name = ratings.get("Taxi")
  println(name)
  println(ratings.keys+": "+ratings.values)
  println(ratings.keySet)
  println(ratings.valuesIterator.max)

  for((key,value) <- ratings) println(s"$key-----$value")

  ratings.foreach{
    case (key,value) => println(s"$key-----foreach-----$value")
  }
}
