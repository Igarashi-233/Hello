package com.bigdata.scala.chapter060708

//scala没有接口(interface)  但是有类似于接口的特质(trait)
object Scala13_Interface1 {
  def main(args: Array[String]): Unit = {
    //java接口无法直接构建对象 需要使用实现类
    //java接口可以声明方法 可以有默认实现
    //java接口可以声明属性 属性无法修改


    //scala特质也无法构建对象
    //scala特质中可以直接执行代码
    //scala特质中生命的属性和方法都可以在类中直接调用
    //    new TestTrait13()
    val user1 = new User13
    user1.username = "Mirai"
    println(user1.username)
    user1.test()
  }
}

//声明特质
trait TestTrait13 {
  println("Xxxxxxxxx")
  var username: String = "IGARASHI"

  def test(): Unit = {
    println("test....")
  }

  //特质中可以声明抽象方法
  def test1()
}

class Person13 {

}

class User13 extends Person13 with TestTrait13 {
  def test1(): Unit ={
    println("1111")
  }
}