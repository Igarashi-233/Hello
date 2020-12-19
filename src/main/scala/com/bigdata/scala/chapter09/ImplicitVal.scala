package com.bigdata.scala.chapter09

object ImplicitVal {

  def main(args: Array[String]): Unit = {
    implicit val str1: String = "jack"

    def hello(implicit name: String): Unit = {
      println(name + " hello")

      hello

      def hello(): Unit = {
        println("aaa")
      }
    }

    hello
  }

  hello

  def hello(): Unit = {
    println("bb")
  }
}
