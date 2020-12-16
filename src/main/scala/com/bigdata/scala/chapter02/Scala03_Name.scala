package com.bigdata.scala.chapter02

object Scala03_Name {
  def main(args: Array[String]): Unit = {
    //标识符
    val ++ = "123"
    val +-*/ = 123
    println(+-*/)

    //scala中  下划线有特殊用途 不能独立当成变量名使用
    val _ = "1234"
    val a = "abc" + _

    //反引号中可以使用关键字做标识符
    val `private` = "asd"

    println(a)
  }

}
