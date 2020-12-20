package com.bigdata.scala.chapter12

object Scala05_Match4 {
  def main(args: Array[String]): Unit = {

    val (x, y) = (1, 2)

    val (username, age, email) = ("IGARASHI", 20, "igarashi233@sina.com")

    println(x + "=" + y)

    println(username + "-" + age + "-" + email)


    println("========================================================")

    val (q, r) = BigInt(10) /% 3 // 包含了2个连续的运算符
    println("q = " + q)
    println("r = " + r)

    println("========================================================")

    val map = Map("A"->1, "B"->0, "C"->3)
    for ( (k, v) <- map ) {
      println(k + " -> " + v)
    }

    for ((k, 0) <- map) {
      println(k + " --> " + 0)
    }

    for ((k, v) <- map if v == 0) {
      println(k + " ---> " + v)
    }


  }
}
