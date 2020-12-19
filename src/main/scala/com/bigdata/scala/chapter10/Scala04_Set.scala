package com.bigdata.scala.chapter10

import scala.collection.mutable

object Scala04_Set {
  def main(args: Array[String]): Unit = {

    //Set 无序 不可重复 默认不可变(immutable)
    val set: Set[Int] = Set(1, 2, 3, 4, 1, 7, 8, 9)
    println(set.mkString(","))
    //增加
    println(set + 11)
    //删除
    println(set - 3)


    //可变Set集合(mutable)
    val mset: mutable.Set[Int] = mutable.Set(1, 2, 3, 4, 1, 7, 8, 9)
    //    mset.insert()
    //    mset.updated()
    //    mset.remove()
    //    mset.drop()
    //。。。。。。。。。

  }
}
