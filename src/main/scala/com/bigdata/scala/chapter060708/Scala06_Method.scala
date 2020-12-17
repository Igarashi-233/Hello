package com.bigdata.scala.chapter060708

//类的方法
object Scala06_Method {
  def main(args: Array[String]): Unit = {
    //创建对象
    val user = new User06

    user.login()

//    val str: String = user.+("xxxxxxxxxx")
    val str = user+"xxxxxxxx"
    println(str)





  }
}

class User06 {
  //登录
  def login(): Unit = {

  }

  //登出
  def logout() = {
    true
  }
}