package com.bigdata.scala.chapter060708

//父类构造方法
object Scala10_Class1 {
  def main(args: Array[String]): Unit = {
    val user = new User10()

  }
}

class Person10(s: String) {
  println("Person 的主构造方法" + s)
}

//如果父类构造方法有参数  构建对象时必须显式的传递参数
class User10(s: String) extends Person10(s) {
  println("User 的主构造方法")

  def this() {
    this("XXXXXXXX")
    println("User 的辅助构造方法")
  }
}
