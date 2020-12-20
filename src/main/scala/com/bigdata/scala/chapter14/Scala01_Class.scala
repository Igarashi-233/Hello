package com.bigdata.scala.chapter14

object Scala01_Class {
  def main(args: Array[String]): Unit = {

    test(new User)
    test(new Person)
    test(new Child)


    //    test1(new Person)  //报错
    test1(new Child)
    test1(new User)


    test2(new Person)
    test2(new Child)
    test2(new User)

  }

  def test[T](t: T): Unit = {
    println(t)
  }

  // < 表示泛型上限 传递数据时应该为子类或者当前类
  def test1[T <: User](t: T): Unit = {
    println(t)
  }

  // < 表示泛型下限 传递数据时可以为任何类
  def test2[T >: User](t: T): Unit = {
    println(t)
  }

}

class Person {

}

class User extends Person {

}

class Child extends User {

}