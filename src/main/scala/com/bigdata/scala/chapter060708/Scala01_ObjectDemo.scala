package com.bigdata.scala.chapter060708

import com.bigdata.scala.chapter060708.test1.Emp

//面向对象
object Scala01_ObjectDemo {
  def main(args: Array[String]): Unit = {

    //创建类的对象
    val user: User = new User()

    val emp = new Emp

    //调用类的属性或方法
    user.username = "IGARASHI"
    println(user.username)

  }
}

//声明类
class User {
  //声明属性
  var username: String = _

  var age: Int = _

  def login()={
    true
  }

}
