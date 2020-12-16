package com.bigdata.scala.chapter04

object Scala02_Exp {
  def main(args: Array[String]): Unit = {
    //scala中所有的表达式都有值

    val flg = false
    val result: Any = if (flg) {
      "igarashi"
      println("igarashi")
    } else {
      "mirai"
    }
    println(result)

    // if else 模拟三元运算符
    val s = if (flg) "a" else "b"
    println(s)
  }
}
