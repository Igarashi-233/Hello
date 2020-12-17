package com.bigdata.scala.chapter060708

//构造方法
object Scala08_Method2 {
  def main(args: Array[String]): Unit = {
    //创建对象
    val user = new User08("IGARASHI")
    val user1 = new User08()
    println(user)


  }
}

//TODO Scala构造方法分两类: 主构造 & 辅助构造
//Scala是完全面向函数的语言 类也是函数
//类所代表的函数其实就是类的构造方法
//在类后面声明的构造方法是主构造方法
//在主构造方法中声明的构造方法是辅助构造方法
class User08(s: String) {
  //类体 & 构造方法体
  println("主构造方法")
  println(s)

  def this(s: String, ss: String) {
    this(s)
    println("辅助构造方法2")
  }

  //声明辅助构造方法  方法名为this
  //TODO 构造方法调用其他构造方法时  应该保证被调用的构造方法已经声明过
  def this() {
    this("辅助构造方法1" , "xxxxxxxx")
  }

}