package com.strings

import scala.collection.mutable

object StringBuilderExample extends App {

  val name ="Tamizharsu"
  val message  = "Welcome" + name
  println(message)

  val sb = new mutable.StringBuilder("Arasu ")
  sb += '1'
  sb ++= " 2022"
  println(sb.toString().contains("Arasu 1 2022"))
  println(sb.indexOf('A'))
  println(sb.length())
  println(sb.distinct)
  println(sb.toString()+" After fold "+sb.toString().split(" ").foldLeft("")(_+_))
  println(List.range(1, 5).sum)
  val l = List(1, 2, 3)
  println(l.foldLeft(List.empty[Int]) { (start, end) => end :: start })
  println(l.foldRight(List.empty[Int]){(acc,ele) => acc :: ele})
  println(sb.mkString(""))
  val nonempty = new mutable.StringBuilder()
  println(nonempty.nonEmpty)

  val counts = "tamizharasu".groupBy(f => f).map({
    case(k,v) => (k,v.length)
  })
  println(counts)

  var ints = "".split("").toList
  println(ints)
//  for (i <- ints-1 to (1,-1) ) {
//    println("intsre : "+i)
//  }

}
