package com.github.kmizu.itstaffing_scala_example

object PatternMatching1 extends App {
  val A = 1
  val B = 2
  val C = 3
  val x = 1
  val result = x match {
    case A => "x is 1"
    case B => "x is 2"
    case C => "x is 3"
  }
  println(result)
}
