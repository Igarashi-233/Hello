package com.bigdata.scala.chapter03

object Scala02_Oper {
  def main(args: Array[String]): Unit = {
    var b = 10
    var s = "10"
    if (b == 10) {
      //所有scala表达式都有结果
      println(b = 10)

      //类型不匹配
      println(s == b)

      println("true")
    } else {
      println("false")
    }
  }

}
