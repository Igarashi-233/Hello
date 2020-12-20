package com.bigdata.scala.chapter10

import scala.collection.mutable

object Scala14_Method5 {
  def main(args: Array[String]): Unit = {

    //List(1,2,3,4,5,6)
    val list = List(1, List(2, 3), List(4, 5, 6))

    val list1 = list.flatMap(any => {
      if (any.isInstanceOf[List[Int]]) {
        any.asInstanceOf[List[Int]]
      } else {
        List(any)
      }
    })

    println(list1)


    println("---------------------------------并行操作------------------------------------")

    val result1 = (0 to 100).map { case _ => Thread.currentThread.getName }
    val result2 = (0 to 100).par.map { case _ => Thread.currentThread.getName }
    println(result1)
    println(result2)


  }

}
