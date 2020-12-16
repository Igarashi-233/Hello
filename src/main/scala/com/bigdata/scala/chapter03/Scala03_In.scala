package com.bigdata.scala.chapter03

import scala.io.StdIn

object Scala03_In {
  def main(args: Array[String]): Unit = {
    val line: String = StdIn.readLine()
    println("line=" + line)
  }

}
