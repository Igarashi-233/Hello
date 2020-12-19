package com.bigdata.scala.chapter09

import com.bigdata.scala.chapter09.Scala04_Transform3.User4

object Scala04_Transform3 {
  def main(args: Array[String]): Unit = {

    val user4 = new User4
    user4.insert
    user4.delete

  }

  class User4 extends Test {
    def insert() {

    }
  }

}
trait Test{

}
object Test{
  implicit class Person4(u: User4) {
    def delete() {

    }
  }
}

