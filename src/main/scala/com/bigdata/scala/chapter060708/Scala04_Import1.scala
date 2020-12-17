package com.bigdata.scala.chapter060708

//scala从最原始的包中查找类 需要增加绝对路径 使用 _root_开头
import _root_.java.util._

package java{
  package util{

    class HashMap{

    }

    object Scala04_Import1{
      def main(args: Array[String]): Unit = {
        val map = new HashMap

        val map1 = new _root_.java.util.HashMap

        println(map)
        println(map1)
      }
    }

  }
}

