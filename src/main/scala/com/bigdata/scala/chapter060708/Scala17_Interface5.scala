package com.bigdata.scala.chapter060708

//scala没有接口(interface)  但是有类似于接口的特质(trait)
object Scala17_Interface5 {
  def main(args: Array[String]): Unit = {
    val mysql = new MySQL17
//    mysql.getMessage
  }
}

//特质可以继承类
//trait Operate17 extends Exception{
trait Operate17 {

  //特质使用范围
  this: Exception =>
  def insert(): Unit = {
    println("插入数据")
    this.getMessage
  }

}

class MySQL17 extends Exception with Operate17 {

}