package com.collections.commonseqmethod

object CommonSeqMethods extends App {

  val nums = (1 to 10).toList
  val names = List("tamizh","arasu","chinna","paun")

  val douledNums = nums.map(_*2)
  println(douledNums)
  val lessThanFive = douledNums.map(_< 5)
  println(lessThanFive )
  val capNames = names.map(_.capitalize)
  println(capNames)

  val lesserFive = nums.filter(_<5)
  println(lesserFive)
  val even = nums.filter(_%2==0)
  println(even)
  val shortNames = names.filter(_.length<=5)
  println(shortNames)

  names.map(_.toUpperCase()).foreach{f =>
    print(s" Names Are : $f")
  }

  println()
  println("Head : "+names.head.capitalize+" Tail :"+names.tail.map(_.capitalize))
  //java.util.NoSuchElementException: head of empty list
  //java.lang.UnsupportedOperationException: tail of empty list

  val nam = nums.take(3)
  println(nam)
  val name = names.take(2)
  println(name)

  val lessFour = nums.takeWhile(_<8)
  println(lessFour)
  val lessFourNames = List("tamizh","arasu").takeWhile(_.length<=6)
//  List("tamizh","arasu","tamizharasu","chin).takeWhile(_.length<=6) it will only condition satisfied values from list
  // 3rd value is more than 6 chars so after any values wont diplayed
  // add elements into new list
  println(lessFourNames)

  val dropss = nums.drop(4)
  println(dropss)
  val dropnames = names.dropWhile(_.length<7)
  println(dropnames)
  val dropname = names.dropWhile(_!="chinna")
  println(dropname)
// this will remove the elements

  val reduces = nums.reduce(_+_)
  println(reduces)
  val reducedm = List.range(1,6).reduce(_*_)
  println(reducedm)

}
