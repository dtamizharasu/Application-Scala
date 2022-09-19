package com.collections.commonmapmethod

object CommonMapMethods extends App {

  val m = Map(
    1 -> "a",
    2 -> "b",
    3 -> "c",
    4 -> "d"
  )

  for ((k,v) <- m) printf("key: %s, value: %s\n", k, v)

  val keys = m.keys
  val values = m.values
  val contains = m.contains(4)
  val ucMap = m.transform((k,v)=> v.toUpperCase())
//  val filter = m.view.filterKeys(Set(2,3)).toMap
  val first2 = m.take(2)
  val filter2 = m.filter(_._1 >= 2)

  println("Keys: "+keys)
  println("Values: "+values)
  println("Contains: "+contains)
  println("Transform: "+ucMap)
//  println("Filter: "+filter)
  println("First2: "+first2)
  println("Filter: "+filter2)

  var states = scala.collection.mutable.Map(
    "AL" -> "Alabama",
    "AK" -> "Alaska",
    1 -> 1
  )
  states += ("AZ" -> "Arizona")
  states ++= Map("CO" -> "Colorado", "KY" -> "Kentucky")
  println("Before Remove : "+states)
  states -= "KY"
  states --= List("AZ", "CO")
  println("After Remove : "+states)
  states("AK") += "Alaska, The Big State"
  println(states)
//  states = states.filterInPlace((k,v) => k == "AK")
  println(states)

  val nums = List(10,10,20,30)
  var count = scala.collection.mutable.Map[Int,Int]()

  for(data <- nums) yield if(count.contains(data)) count.put(data,count(data)+1) else count.put(data,1)
  println(count)

  val counts = nums.groupBy(k => k).map{
    case(k,v) => (k,v.size)
  }
  println(counts)

}
