package com.bigdata.scala.chapter02

/**
 * 变量
 */
object Scala01_Var {

  //在方法外部声明的变量如果采用val关键字  等同于使用final修饰
  val sex : String = "Male"

  def main(args: Array[String]): Unit = {

    //声明变量
    //var/val  变量名称 : 变量类型 = 变量值
    var name : String = "IGARASHI"

    //var 声明的变量可以修改      val 声明的变量不能修改
    var age : Int = 10
    val agel : Int = 10

    var c : Char = 'C'
    val cl : Char = 'C'

    var b : Boolean = true
    val bl : Boolean = true
  }
}
