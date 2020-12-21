package com.bigdata.scala.chapter09

object Scala09 {
  def main(args: Array[String]): Unit = {
    //Test1
        implicit val name: String = "Scala"
    //    def hello(implicit content: String = "okok") = {
    //      println("Hello " + content)
    //    }
    //    hello


    //Test2
    //    implicit val age: Int = 10
    //    def hello1(implicit content: String = "okok") = {
    //      println("Hello " + content)
    //    }
    //    hello1


//    //Test3
    implicit val age: Int = 10

    def hello2(implicit content: String) = {
      println("Hello " + content)
    }
//
    hello2 //报错
  }
}
