package com.github.kmizu.itstaffing_scala_example

object PatternMatching2 extends App {
  sealed abstract class Color
  case object Red extends Color
  case object Green extends Color
  case object Blue extends Color
  val c: Color = Red
  val result = c match {
    case Red => "赤"
    case Green => "緑"
    case Blue => "青"
  }
  println(result)

}
