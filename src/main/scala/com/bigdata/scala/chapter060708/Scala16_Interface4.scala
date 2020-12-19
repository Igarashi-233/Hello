package com.bigdata.scala.chapter060708

//scala没有接口(interface)  但是有类似于接口的特质(trait)
object Scala16_Interface4 {
  def main(args: Array[String]): Unit = {
    //动态混入
    val mysql = new MySQL16 with Operate16
    mysql.insert()
  }
}

trait Operate16 {

  def insert(): Unit = {
    println("插入数据")
  }
}

class MySQL16 {

}