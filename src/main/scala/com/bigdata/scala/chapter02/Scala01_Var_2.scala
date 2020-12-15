package com.bigdata.scala.chapter02

object Scala01_Var_2 {

  def main(args: Array[String]): Unit = {
    val username = "IGARASHI"

    //    "IGMIRAI".var
    val dog = new Dog
    dog.name = "xxxxxx"
    println(dog.name)
  }
}

class Dog {
  var name = ""
}