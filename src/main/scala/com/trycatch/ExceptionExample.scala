package com.trycatch

import java.io.{FileNotFoundException, IOException}

object ExceptionExample extends App {

  var text = ""
  try{

  }catch {
    case e : FileNotFoundException => "File Not Found"
    case e : IOException => "File Not Able to Open"
  }
}
