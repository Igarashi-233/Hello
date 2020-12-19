package com.bigdata.scala.chapter10

object Scala09_WordCount {
  def main(args: Array[String]): Unit = {

    //TODO WordCount测试
    //数据准备
    val lineList: List[(String, Int)] = List(("Hello Scala World", 4), ("Hello World", 3), ("Hello Hadoop", 2),
      ("Hello Hbase", 1))

    println("-----------------------------------分步---------------------------------------")

    //  分割后  List(Hello, Scala, World, Hello, World, Hello, Hadoop, Hello, Hbase)
    //  整合集合 List((Hello,4), (Scala,4), (World,4), (Hello,3), (World,3), (Hello,2), (Hadoop,2), (Hello,1), (Hbase,1))
    val flatMapList = lineList.flatMap(t => {
      t._1.split(" ").map(w => (w, t._2))
    })
    //    Map(Hbase -> List((Hbase,1)), Scala -> List((Scala,4)), Hello -> List((Hello,4), (Hello,3), (Hello,2), (Hello,1)), Hadoop -> List((Hadoop,2)), World -> List((World,4), (World,3)))
    val groupByList = flatMapList.groupBy(word => word._1)
    val sumList = groupByList.map(t => {

      //      List(1)
      //      List(4)
      //      List(4, 3, 2, 1)
      //      List(2)
      //      List(4, 3)
      val ints = t._2.map(t => {
        t._2
      })
      //      println(ints)

      (t._1, ints.sum)
    })

    //    Map(Hbase -> 1, Scala -> 4, Hello -> 10, Hadoop -> 2, World -> 7)
    val sortList = sumList.toList.sortWith((left, Right) => {
      left._2 > Right._2
    })

    //    List((Hello,10), (World,7), (Scala,4), (Hadoop,2), (Hbase,1))
    val result = sortList.take(3)
    println(result)


    println("-----------------------------------整合---------------------------------------")


    val resultList = lineList.flatMap(t => {
      t._1.split(" ").map(word => (word, t._2))
    }).groupBy(word => word._1).map(t => {
      (t._1, t._2.map(t => {
        t._2
      }).sum)
    }).toList.sortWith((left, right) => {
      left._2 > right._2
    }).take(3)
    println(resultList)


  }
}
