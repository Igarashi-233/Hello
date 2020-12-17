package com.bigdata.scala.chapter05

object Scala08_Lazy {
  def main(args: Array[String]): Unit = {
    lazy val res = sum(10, 20)
    println("-----------------")
    println("-----------------")
    println("-----------------")
    println("res=" + res)
  }
  def sum(n1 : Int, n2 : Int): Int = {
    println("sum() 执行了..")
    return  n1 + n2
  }
}
