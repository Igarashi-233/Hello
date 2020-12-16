package com.bigdata.scala.chapter02

object Scala02_DataType1 {
  def main(args: Array[String]): Unit = {
    val i : Int = 10

    //val d : Double = i
    val d = i.toDouble

    /*
    类型转换
    d.toInt
    d.toByte...
    */
    println(d)
    println(Unit)

    val s : String = null

    //int null 不能赋值
//    val ii : Int = null

//    println(ii)
  }

  def f1(): Nothing = {
    throw new Exception()
  }
}
