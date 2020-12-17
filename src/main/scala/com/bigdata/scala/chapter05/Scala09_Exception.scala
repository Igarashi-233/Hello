package com.bigdata.scala.chapter05

object Scala09_Exception {
  def main(args: Array[String]): Unit = {
    //异常
    try {
      val i=10
      val j=0
      val k=i/j
    }catch {
      case _:ArithmeticException=> println("捕捉除数为零的算数异常")
      case _:Exception=> println("捕捉了异常")
    }finally {
      println("finally.......")
    }
  }
}
