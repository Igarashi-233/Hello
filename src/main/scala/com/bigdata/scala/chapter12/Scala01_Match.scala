package com.bigdata.scala.chapter12

object Scala01_Match {
  def main(args: Array[String]): Unit = {


    //    val list = List(List(1, 2), List(3, 4))
    //    //List(1,2,3,4)
    //    val flatList = list.flatMap(_)
    //    println(flatList)


    val list = List("Hello Scala", "Hello World")
    val strings = list.flatMap(
      _.split(" ")
    )
    println(strings)


    val oper = '#'
    val n1 = 20
    val n2 = 10
    var res = 0
    oper match {
      case '+' => res = n1 + n2
      case '-' => res = n1 - n2
      case '*' => res = n1 * n2
      case '/' => res = n1 / n2
      case _ => println("oper error")
    }
    println("res=" + res)

  }
}
