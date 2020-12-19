package com.bigdata.scala.chapter10

object Scala08_Method1 {
  def main(args: Array[String]): Unit = {

    val list = List(1, 2, 5, 4, 2, 1, 1, 2, 7, 8, 2)

    //TODO 对集合数据过滤 true保留  false不保留
    println(" Filter")
    val filterList: List[Int] = list.filter(x => x % 2 == 0)
    println(filterList.mkString(","))

    //TODO 拉链 顺序对应 没有则不对应
    println("\n ZIP")
    val list1 = List(1, 2, 3, 9)
    val list2 = List(3, 5, 7)
    //关联后的数据形成了元组
    val tuples: List[(Int, Int)] = list1.zip(list2)
    println(tuples.mkString(","))

    //集合并集
    val unionList: List[Int] = list1.union(list2)
    println(unionList)

    //集合交集
    val intersectList: List[Int] = list1.intersect(list2)
    println(intersectList)

    //集合差集
    val diffList: List[Int] = list1.diff(list2)
    println(diffList)


  }
}
