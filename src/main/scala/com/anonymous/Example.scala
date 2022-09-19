package com.anonymous

object Example extends App {

  // simplifying the function

  var lists = List.range(1,11).map(_*2).filter(_%2==0)
  println(lists)
}
