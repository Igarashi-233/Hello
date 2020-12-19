package com.bigdata.scala.chapter10

import scala.collection.mutable
import scala.collection.mutable.{ArrayBuffer, ListBuffer}


object Scala03_Seq {
  def main(args: Array[String]): Unit = {

    //序列
    //默认scala提供的集合都是不可变的
    val list: List[Int] = List(1, 2, 3, 4)

    //通过索引获取数据
    println(list(2))

    //集合尾添加
    val list1: List[Int] = list :+ 6
    println(list1.mkString(","))
    //集合头部添加
    val list2: List[Int] = 0 +: list1
    println(list2.mkString(","))

    println(list == list1 == list2) //不可变集合  互不相等

    //集合添加集合
    val List1: List[Int] = List(4, 5, 6, 7)
    val newList: List[Int] = list ++ List1
    println(newList.mkString(","))

    // 冒号的执行顺序为从右到左
    val newList2: List[Int] = 7 :: 8 :: 9 :: list
    println(newList2.mkString(","))

    // :: 执行集合拼接
    val list3 = 9 :: List1 :: list
    println(list3.mkString(","))

    // ::: 执行集合元素拼接
    val list4 = 9 :: List1 ::: list
    println(list4.mkString(","))


    //特殊List集合:  Nil空集合
    println(List())
    println(Nil)


    //修改
    val list5: List[Int] = list.updated(2, 6)
    println(list5.mkString(","))


    //删除
    val list6: List[Int] = list.drop(2)
    println(list6.mkString(","))


    //查询
    for (elem <- list) {
      println(elem)
    }


    println("--------------------------分界线------------------------------")


    //TODO 可变集合
    val mlist: ListBuffer[Int] = ListBuffer(1, 2, 3, 4)
    //    mlist.insert()
    //    mlist.updated()
    //    mlist.remove()
    //    mlist.drop()
    //。。。。。。。。。

    //集合属性
    //头
    println(mlist.head)
    //尾 除了头部的剩下部分
    println(mlist.tail)

    //最后一个元素
    println(mlist.last)
    //初始化(除了最后一个元素)
    println(mlist.init)


    println()

    //队列(一定可变)
    val q = mutable.Queue(1, 2, 3, 4)
    println("add before = " + q)
    q.enqueue(5)
    println("add after = " + q)
    val i: Int = q.dequeue()
    println("i=" + i)
    println("delete after = " + q)


  }
}
