package com.bigdata.scala.chapter02

object Scala02_DataType {
  def main(args: Array[String]): Unit = {
    //数据类型
    //Scala没有基本数据类型
    //Scala中数字也是对象
    // 错误格式  val age : int = 20
    val age : Int = 10

    //byte, short, int, long, float, double, boolean, char
    val b : Byte = 10
    val s : Short = 10
    val i : Int = 10
    val lon = 100000000000000000L
    val f : Float = 10
    val d : Double = 10
    val bln : Boolean = true
    val c : Char = 'c'

    val ii : Integer = 10
  }
}
