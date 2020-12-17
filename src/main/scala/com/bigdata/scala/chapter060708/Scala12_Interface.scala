package com.bigdata.scala.chapter060708

//scala没有接口(interface)  但是有类似于接口的特质(trait)
object Scala12_Interface {
  def main(args: Array[String]): Unit = {
    val user = new User12()
    println(user)
  }
}
//声明特质
trait TestTrait1 {

}
trait TestTrait2{

}
class Person12{

}
//特质可以继承 多个特质用with连接
//同时存在父类和特质  父类用extends 特质用with
class User12 extends Person12 with TestTrait1 with TestTrait2 {

}