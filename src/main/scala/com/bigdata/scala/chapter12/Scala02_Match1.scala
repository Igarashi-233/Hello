package com.bigdata.scala.chapter12

object Scala02_Match1 {
  def main(args: Array[String]): Unit = {


    for (ch <- "+-3!") {
      var sign = 0
      var digit = 0
      ch match {
//        case _ => sign = 233     一般放最后
        case '+' => sign = 1
        case '-' => sign = -1
        case _ if ch.toString.equals("3") => digit = 3
        case _ => sign = 2
      }
      println(ch + " " + sign + " " + digit)
    }


    val ch = 'V'
    ch match {
      case '+' => println("ok~")
      case mychar => println("ok~" + mychar)
      case _ => println ("ok~~")
    }


  }
}
