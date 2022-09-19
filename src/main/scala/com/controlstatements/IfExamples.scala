package com.controlstatements

object IfExamples {

  def main(args: Array[String]): Unit = {

    val a = 5
    val b = 10
    if(a>b)
      println("A Greater")
      else
      println("B Greater")
    val maxValue = if(a<b) "A Greater" else "B Greater"
    println(maxValue)
    val minValue = if(5>1) 5 else 1
    println(minValue)
  }
}
