package com.bigdata.scala.chapter04

object Scala01_Process {
  def main(args: Array[String]): Unit = {
    //流程控制

    //单分支
    val flg = true
    if (flg) {
      println("true")
    }

    //多分支
    if (!flg) {
      println("true")
    } else {
      println("false")
    }

    val s = "a"
    if ("a".equals(s)) {
      println("aaaaa")
    } else if ("b".equals(s)) {
      println("bbbbb")
    } else {
      println("ccccc")
    }

    var x = 4
    var y = 1
    if (x > 2) {
      if (y > 2)
        println(x + y)
      println("IGARASHI")
    } else
      println("x is " + x)

  }
}
