package com.bigdata.scala.chapter04

import scala.util.control.Breaks

object Scala03_For {
  def main(args: Array[String]): Unit = {
    //for循环
    //使用 1to5 表示循环范围从1到5
    //使用 1until5 表示循环范围从1到4
    // 1.to(5)
    for (i <- 1 to 5) {
      println(s"i=$i")
    }

    // 1.until(5)
    //    for (i <- 1 until 5) {
    for (i <- Range(1, 5, 2)) {
      println(s"i=$i")
    }

    for (i <- 1 to 3) {
      for (j <- 1 until 3) {
        println(s"$i=$j")
      }
    }

    /**
     * *
     * ***
     * *****
     * *******
     * 。。。。。。
     *
     */

    /*
    for (i <- Range(1, 18, 2)) {
      val j = (18 - i) / 2
      println(" " * j + "*" * i + " " * j)
    }
    */
    //for循环中可以用一行来声明变量  也可以用多行(将小括号变为大括号)
    for (i <- Range(1, 18, 2); j = (18 - i) / 2) {
      println(" " * j + "*" * i + " " * j)
    }
    for {i <- Range(1, 18, 2)
         j = (18 - i) / 2} {
      println(" " * j + "*" * i + " " * j)
    }

    //增加条件判断 如果条件成立 执行循环体 条件不成立 跳过循环体
    for (i <- 1 to 5 if i % 2 == 0) {
      println(s"$i")
    }

    //默认情况下 for循环返回值是Unit
    val unit: Unit = for (i <- 1 to 3) {
      println(s"$i")
      "abc"
    }
    println(unit)
    //特殊情况  采用yield  可以将每一次循环的结果保存到集合中返回
    val res = for (i <- 1 to 10) yield i * 2
    println(res)


    //中断For循环
    Breaks.breakable {
      for(i <- 1 to 10){
        if(i == 5){
          Breaks.break()
        }
        println(s"$i")
      }
    }
    println("循环结束")

  }

}
