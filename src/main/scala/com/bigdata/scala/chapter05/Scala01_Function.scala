package com.bigdata.scala.chapter05

object Scala01_Function {
  def main(args: Array[String]): Unit = {
    //函数式编程
    //声明函数
    def test(s: String): Unit = {
      //函数体
      println(s)
    }
    //调用函数
    test("IGARASHI")

  }
}
