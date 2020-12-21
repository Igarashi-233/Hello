package com.bigdata.scala.chapter10

import scala.collection.mutable.ArrayBuffer


object Scala02_Array {
  def main(args: Array[String]): Unit = {

    //Scala中的数组  使用Array对象实现  []声明数组类型
    //Array[String]  可以直接使用Array 通过apply方法创建数组对象
    //不可变数组
    val ints: Array[Int] = Array(1, 2, 3, 4)
    //访问数组
    println(ints(0))
    //长度
    println(ints.length)

    println(ints.+("ads"))

    println(ints.mkString(","))

    //遍历数组
    //    for (elem <- ints) {
    //      println(elem)
    //    }

    //    def printlnXXX(i: Int): Unit = {
    //      println(i)
    //    }
    //    ints.foreach(printlnXXX)

    //简化
    /*    ints.foreach((i: Int) => {
          println(i)
        })
        ints.foreach({
          println(_)
        })
        ints.foreach(println)    */

    //增加元素
    //实质上是向新数组中添加元素  不会对原有数组造成影响
    val ints1: Array[Int] = ints :+ 6
    val ints2: Array[Int] = 7 +: ints

    println(ints1.mkString(","))
    println(ints2.mkString(","))
    //    println(ints == ints1)

    //修改元素
    ints.update(1, 5)
    println(ints.mkString(","))


    //可变数组
    val arraybuffer: ArrayBuffer[Int] = ArrayBuffer(1, 2, 3, 4, 5)
    println(arraybuffer(0))
    //修改
    arraybuffer(0) = 9
    println(arraybuffer.mkString(","))

    //循环
    //    arraybuffer.foreach(println)

    //增加
    val arraybuffer1: arraybuffer.type = arraybuffer += 9
    println(arraybuffer == arraybuffer1)
    println(arraybuffer1.mkString(","))

    //指定位置增加
    arraybuffer.insert(2, 233)
    println(arraybuffer.mkString(","))

    //删除元素
    //    val i = arraybuffer.remove(2)  索引删除
    //    println(i)
    /**
     * 只能删除集合中存在的数据  数据如果有重复 则删除第一个
    val arraybuffer2: arraybuffer.type = arraybuffer -= 2
    println(arraybuffer2.mkString(","))
    */
    arraybuffer.remove(0, 3)
    println(arraybuffer.mkString(","))


    //可变数组  不可变数组  转换
    //    val buffer: mutable.Buffer[Int] = ints.toBuffer
    //    val array: Array[Int] = arraybuffer.toArray

  }
}
