package com.collections.arraybuffer

import scala.collection.mutable.ArrayBuffer

object ArrayBufferExample extends App {

  val names = scala.collection.mutable.ArrayBuffer[String]()
  val numbers = ArrayBuffer[Int]()

  names+="Tamizh"
  names+="Arasu"
  names++=Array("Test","Sample")

  numbers+=10
  numbers+=20
  numbers++=Vector(25,35)

  println(names)
  println(numbers++=List(40,50))

  var num = ArrayBuffer[Int](4)
  num.append(5)
  num.appendAll(Seq(6,7,8))
  println(num)
  num.clear()
  println(num)
  num.insert(0,5)
  num.insertAll(0,Vector(11,22,32))
  num.prepend(0)
  num.prependAll(List(1,2,3))
  println(num)

  val range = ArrayBuffer.range(101,111)
  range.remove(0)
  range.remove(2,3)
  println(range)
  println(range+" ---  "+range.take(1)) // starting position is 1

  for(i <- 0 to  range.size-1) println(range(i)) // starting position is 0
}
