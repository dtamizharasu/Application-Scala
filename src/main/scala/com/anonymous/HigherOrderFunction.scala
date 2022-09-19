package com.anonymous

import scala.util.{Failure, Success, Try}
object HigherOrderFunction extends App{

  def doubled (int :Int) : Int = int*2
  val x1 = List.range(1,5).map(doubled)
  println(x1)

//  def toInt(s:String): Option[Int]={
//  try{
//    Some(Integer.parseInt(s.trim))
//  }catch {
//    case e : Exception => None
//  }
//  }

//  println(toInt("s"))
//  print(toInt("2"))

  def toInt(s: String): Option[Int] = {
    try {
      Some(Integer.parseInt(s.trim))
    } catch {
      case e: Exception => None
    }
  }

  val y11 = "1"

    toInt(y11) match {
    case Some(i) => println(i)
    case None => println("That didn't work.")
  }

  val stringA = "1"
  val stringB = "2"
  val stringC = "3"

  val y = for {
    a <- toInt(stringA)
    b <- toInt(stringB)
    c <- toInt(stringC)
  } yield a + b + c


  def toInts(s: String): Try[Int] = Try(Integer.parseInt(s.trim))

  toInts("1") match {
    case Success(i) => println(i)
    case Failure(s) => println(s"Failed. Reason: $s")
  }

  val y1 = for {
    a <- toInt(stringA)
    b <- toInt(stringB)
    c <- toInt(stringC)
  } yield a + b + c

  val reverse = List.range(1,5).reverse
  val sort = List(2,5,1,6,3).sorted
  println(sort)
  println(reverse)

}
