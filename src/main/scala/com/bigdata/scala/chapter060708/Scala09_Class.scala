package com.bigdata.scala.chapter060708

//构造方法
object Scala09_Class {
  def main(args: Array[String]): Unit = {
    val user = new User09()
    user.name
    user.test()
    user.test1()
    user.email

  }
}

//声明类
//父类 继承
//可以抽象
class User09 extends Person {

  //重写抽象方法(补全)
  def test(): Unit = {
    println("xxxxxxx")
  }

  //scala 子类重写父类方法(不是抽象)  要添加override关键字
  override def test1(): Unit = {
    println("Children test1")
  }

  //重写属性(补全)
  var sex: String = "male"

  //属性可以被重写 但是不能重写父类var声明的变量 需要使用val声明
  override val email : String = "igarashi233@sina.com"
}

abstract class Person {
  //Scala 属性也可以重写
  var name: String = _
  //属性只有声明 没有初始化 ==> 抽象属性
  var sex : String

  val email : String = "zzzz"

  //声明抽象方法  方法只有声明 没有实现 不需要abstract关键字声明
  def test()

  def test1(): Unit = {
    println("Parent test1")
  }
}