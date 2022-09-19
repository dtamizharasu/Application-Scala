package com.collections.lists

object ListExample extends App {

  val num = List(1,2,3,"i")
  val nums = 0+:num
  println(nums)

  var names = List("Joel", "Chris", "Ed")
  for (name <- names) println(name)

  val name = List("Tamizh") ++ names
  println(name +" : Size of List :"+name.take(1))
}
