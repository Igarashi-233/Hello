package com.bigdata.scala.chapter10

object Scala12_Method3 {
  def main(args: Array[String]): Unit = {

    var list = List(1, 2, 3, 4)

    //折叠
    println(" Fold")
    //fold传递两个部分的参数 第一部分是集合之外的数据
    //    第二部分是进行的逻辑处理
    val i = list.fold(100)(_ - _)
    //    foldLeft & fold 效果相同
    val i1 = list.foldLeft(100)(_ - _)
    println(i1)

    val scanList = list.scanLeft(10)(_ - _)
    println(scanList)


    val i2 = list.foldRight(10)(_ - _)
    println(i2)

    val scanList1 = list.scanRight(10)(_ - _)
    println(scanList1)


  }
}
