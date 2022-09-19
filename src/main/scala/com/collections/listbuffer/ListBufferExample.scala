package com.collections.listbuffer

import scala.collection.mutable.ListBuffer

object ListBufferExample extends App {

  val numbers = ListBuffer(0)
  numbers += 10
  numbers ++= List(20,30,40,50)
  println(numbers)
  numbers -= 0
  numbers --= List(10,20)
  println(numbers)
}
