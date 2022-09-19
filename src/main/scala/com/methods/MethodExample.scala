package com.methods

object MethodExample extends App with Tags {

  def addDouble(a: Int, b: Int): Int = (a + b) * 2

  println(addDouble(2,3))

  override def speak(): Unit = println("overwritten")
  def come(): Unit = println("abstract")
}
