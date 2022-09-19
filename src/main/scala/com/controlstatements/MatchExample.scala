package com.controlstatements

object MatchExample extends App {

    val i = 5
    val numbers = i match {
      case 1 => "one"
      case 5 => "Five"
      case _ => "Others"
    }
  println("Normal Match : "+numbers)

  def booleanToString(boolean: Boolean) = boolean match {
    case true => "True"
    case false => "False"
  }
  println(booleanToString(true))

  def isTrue(a: Any) = a match {
    case 0 | "" => false
    case _ => true
  }

  println(isTrue(0))
}
