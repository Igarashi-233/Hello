package com.bigdata.scala.chapter060708

//import 用于导入类  可以在任意地方使用
//import 导入所有类采用 "_"
//import 导入相同包中的多个类 采用大括号进行包含
//import 可以采用特殊的方式隐藏指定的类 {类明=>_}
/*import java.util.{ArrayList, List, Date=>_, HashMap}
import java.sql.Date*/

//scala 可以直接导包
//import java.util

//scala可以起别名
import _root_.java.util.{HashMap=>JavaHashMap}

object Scala03_Import{
  def main(args: Array[String]): Unit = {
//    import java.util.Date
    val date = new _root_.java.util.Date()

    new JavaHashMap()
  }
}
