package com.collections.vectors

object VectorExample extends App {

  var name1 = Vector("Tamizh","Arasu")
  println("No Values : "+name1)
  var name2 = name1 ++: Vector("Chinna")
  println("Left : "+name2)
  var name3 = "Arasu" +: name2
  println("Left : "+name3)
  val name4 = name3 :+ "Tamizh"
  println("Right : "+name4)
  val name5 = Vector("FIve") ++ name4
  println(name5+" common : "+name5.head)

  val a = Vector(1,2,3)
  val b = 0 +: a
  val c = b :+ 4
  println(c)

}
