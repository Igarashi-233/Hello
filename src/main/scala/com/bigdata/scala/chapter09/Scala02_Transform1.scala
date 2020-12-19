package com.bigdata.scala.chapter09

object Scala02_Transform1 {
  def main(args: Array[String]): Unit = {

    implicit def transform(mysql: Mysql): Operate = {
      new Operate
    }
    /**
     *  不能重复定义相同转换
    implicit def transform1(mysql: Mysql): Operate = {
      new Operate
    }
    */

    val mysql = new Mysql
    mysql.select
    mysql.delete

  }
}

class Operate {
  def delete: Unit = {

  }
}

class Mysql {
  def select: Unit = {

  }
}