package com.bigdata.scala.chapter10

import scala.collection.mutable

object Scala13_Method4 {
  def main(args: Array[String]): Unit = {
    val map1 = mutable.Map("a" -> 1, "b" -> 2, "c" -> 3)
    val map2 = mutable.Map("a" -> 3, "c" -> 2, "d" -> 1)


    //合并相同key
    val stringToInt = map2.foldLeft(map1)((map, t) => {

      //map赋值方式 map(key)=value
      map(t._1) = map.getOrElse(t._1, 0) + t._2

      map
    })
    println(stringToInt)

  }

}
