package com.bigdata.scala.chapter14

object Scala02_Class1 {
  def main(args: Array[String]): Unit = {

    //不可用
    //    val value: Test[User1] = new Test[Child1]


    //协变 逆变
    val value: Test[User1] = new Test[Child1]
    println(value)
    val value1: Test1[User1] = new Test1[Person1]
    println(value1)


  }

}

class Person1 {

}

class User1 extends Person1 {

}

class Child1 extends User1 {

}

//协变
class Test[+User1] {

}

//逆变
class Test1[-User1] {

}