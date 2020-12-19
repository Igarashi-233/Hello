package com.bigdata.scala.chapter10

object Scala06_Tuple {
  def main(args: Array[String]): Unit = {

    //Tuple  元组
    //将无关的数据整合起来
    //empid,  email,  ordernum
    //元组中数据最多22个  且不可增加删除
    val tuple: (String, Int, String) = ("IGARASHI", 233, "xxxxx")

    //访问元组中的数据  采用顺序编号
    println(tuple._1)
    //    println(tuple._2)
    //    println(tuple._3)

    //查询 遍历
    for (elem <- tuple.productIterator) {
      println(elem)
    }


    //元组中元素个数为2 称之为对偶 类似于Map
    val tuple1: (Int, String) = (1, "IGARASHI233")
    val tupleMap: Map[Int, String] = Map((1, "IGARASHI233"))

    tupleMap.foreach(t => println(t._1 + "-" + t._2))

  }
}

class User {

  var username: String = _
  var age: Int = _

}