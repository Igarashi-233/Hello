package com.bigdata.scala.chapter02

object Scala02_DataType2 {
  def main(args: Array[String]): Unit = {
    var s : Short = 5
    //Int 无法转 Short
    //s = s-2

    var b: Byte = 3
    //Int 无法转 Byte
    //b = b+4
    b = (b+4).toByte

    var c : Char  = 'a'
    var  i : Int = 5
    var d : Float = .314F
    //提升为最大类型 Float  默认为Int
    var result : Double = c+i+d

    var bb : Byte  = 5
    var ss : Short  = 3
    //Int 无法转 Short
//    var t : Short = ss + bb
    var t2 = ss + bb


    val a : String = "123"
    println(a.toInt)
  }

  def f1(): Nothing = {
    throw new Exception()
  }
}
