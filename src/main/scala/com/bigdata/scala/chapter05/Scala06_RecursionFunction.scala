package com.bigdata.scala.chapter05

object Scala06_RecursionFunction {
  def main(args: Array[String]): Unit = {
    //递归
    //阶乘
    def !!(i:Int):Int={
      println("xxxxxxxx")
      if( i==1 ){
        1
      }else{
        i * !!(i-1)
      }
    }

    println(!!(5))

  }

}
