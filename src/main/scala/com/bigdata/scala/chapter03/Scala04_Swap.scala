package com.bigdata.scala.chapter03

import scala.io.StdIn

object Scala04_Swap {
  def main(args: Array[String]): Unit = {
    //交换
    var a = 10
    var b = 20
    println(s"${a} = ${b}")

    /*
    val c = a
    a = b
    b = c
    println(s"${a} = ${b}")
    */

    /*
    a = a + b
    b = a - b
    a = a - b
    println(s"${a} = ${b}")
    */

    a = a ^ b
    b = a ^ b
    a = a ^ b
    println(s"${a} = ${b}")

  }

}
