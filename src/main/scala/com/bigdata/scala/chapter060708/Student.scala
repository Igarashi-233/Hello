package com.bigdata.scala.chapter060708

//伴生类
class Student {
  val sname = "IGARASHI"
}
//伴生对象   可以访问伴生类的私有属性
//创建伴生类对象
object Student{

  def apply(): Student = new Student()
  
  def test(): Unit ={
    new Student().sname
  }
}
