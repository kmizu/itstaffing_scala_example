package com.github.kmizu.itstaffing_scala_example

object Variable {
  def main(args: Array[String]): Unit = {
    val x: Int = 100
    // val x = 100 // 同じ意味
    // x = 200 // コンパイルエラー
    var y: String = "Foo"
    // var y = "Foo" // 同じ意味
    y = "Bar" // OK
    // y = 100 // コンパイルエラー
  }
}
