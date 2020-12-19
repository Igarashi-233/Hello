package com.bigdata.scala.chapter10

import scala.collection.mutable

object Scala05_Map {
  def main(args: Array[String]): Unit = {

    //Map集合 K-V
    //Scala中 k-v采用特殊方式声明
    val map: Map[String, Int] = Map("a" -> 1, "b" -> 2, "c" -> 3)
    println("add before = " + map.mkString(","))
    //添加 (覆盖效果)
    val map1: Map[String, Int] = map + ("d" -> 4)
    println("add after = " + map1.mkString(","))
    //map集合默认不可变
    println(map == map1)

    //删除 key不存在不报错
    val map2: Map[String, Int] = map - "b"
    println("sub after = " + map2.mkString(","))

    //修改
    val map3: Map[String, Int] = map.updated("b", 5)
    println("update after = " + map3.mkString(","))

    //查询
    //Scala为了防止空指针异常 提供了Some和None两个特殊类
    //Some可以通过 get 取出值   None通过 get 取值会抛出异常
    println(map.get("b"))
    println(map.get("f"))
    //可以通过 getOrElse 给None赋默认值 (已经有值就使用该值 没有就使用默认)
    println(map.get("f").getOrElse(0))

    println("-----------分界线-----------")

    //可变Map集合
    val mMap: mutable.Map[String, Int] = mutable.Map("a" -> 1, "b" -> 2, "c" -> 3)
    //    mMap.insert()
    //    mMap.updated()
    //    mMap.remove()
    //    mMap.drop()
    //。。。。。。。。。

  }
}
