package com.bigdata.scala.chapter10

object Scala11_Method2 {
  def main(args: Array[String]): Unit = {

    //数据准备
    val list = List(1, 2, 3, 4)

    //数据减少
    println("\n Reduce")
    //将集合数据经过逻辑处理后只保留一个结果
    // reduce 和 reduceLeft效果一样
    //    list.reduce((left, right) => {left + right})
    val result = list.reduceLeft(_ - _)
    val result1 = list.reduceRight(_ - _)
    println(result1)


  }
}
