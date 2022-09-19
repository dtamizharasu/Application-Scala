package com.variables

object VariablesExamples {

  def main(args: Array[String]): Unit = {
    println("Welcome Back To Scala ! Again ")
    val x = 10
    val y = 10.1f
    val z = 11.1234
    val long = 1234L

    println(x)
    println(y)
    println(z)
    println(long)

    val name = "Tamizh Arasu"
    println(name)
    println("hello".head)
    println("hello".tail)
    println("hello,world".take(5))
    println("hi")
    val p = new Person("Tamizh")
    println(p.name)
    p.name = "Arasu"
    println(p.name)

    val b: Byte = 1
    val int: Int = 1
    val l: Long = 1L
    val s: Short = 1
    val d: Double = 2.0
    val f: Float = 3.0f
    val bl: Boolean = true

    var bI = BigInt(1234567890)
    var bD = BigDecimal(123456.789)
    var str = "Arasu"
    var chars = "Arasu".split("")
    println(chars.mkString(""))
    val speech =
      """Four score and
               seven years ago
               our fathers ..."""
    println(speech)
    println(s"Name : ${str.toUpperCase()}")
  }
}
