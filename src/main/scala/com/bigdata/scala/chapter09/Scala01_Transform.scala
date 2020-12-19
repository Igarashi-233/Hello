package com.bigdata.scala.chapter09

object Scala01_Transform {
  def main(args: Array[String]): Unit = {

    //自动转换 - 隐式转换
    //scala默认支持数值类型自动转换
    //byte -> short -> int -> long
    //scala默认支持多态语法中的类型自动转换
    //child -> parent -> trait(interface)

    //scala可以自定义类型转换
    implicit def transform(d: Double): Int = {
      d.toInt
    }

    val i: Int = 5.0

    println(i)

  }
}
