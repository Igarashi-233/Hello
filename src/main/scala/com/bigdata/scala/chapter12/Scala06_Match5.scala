package com.bigdata.scala.chapter12

object Scala06_Match5 {
  def main(args: Array[String]): Unit = {

    val dollar = Dollar(1.0)
    dollar.value

    for (amt <- Array(Dollar(1000.0), Currency(1000.0, "RMB"), NoAmount)) {
      val result = amt match {
        case Dollar(v) => "$" + v
        case Currency(v, u) => v + " " + u
        case NoAmount => ""
      }
      println(amt + ": " + result)
    }


  }
}

abstract sealed class Amount

case class Dollar(value: Double) extends Amount

case class Currency(value: Double, unit: String) extends Amount

case object NoAmount extends Amount
