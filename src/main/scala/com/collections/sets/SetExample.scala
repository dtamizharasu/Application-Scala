package com.collections.sets

import scala.collection.convert.ImplicitConversions.`collection asJava`

object SetExample extends App {

  var set = scala.collection.mutable.Set[Int]()
  set += 10
  set ++= List(10,20,30)
  println(set)

  var sets = Set(100,200,300)
  sets += 400
//  println(sets.incl(500))
  sets.remove(500)
  println(sets)
}
