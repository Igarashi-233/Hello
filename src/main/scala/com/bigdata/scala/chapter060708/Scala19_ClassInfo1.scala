package com.bigdata.scala.chapter060708

//Scala会自动导入scala包中的类
object Scala19_ClassInfo1 extends App {
  println("xxxxxxxxxxx")
  Color.RED
  Color.YELLOW
}

//枚举
object Color extends Enumeration{

  //隐式转换
  var RED = Value(0,"red")
  var YELLOW = Value(1,"yellow")
}