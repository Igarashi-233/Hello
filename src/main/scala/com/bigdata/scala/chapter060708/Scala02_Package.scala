package com.bigdata.scala.chapter060708

//scala中 包的声明方式默认和Java一致  也存在其他使用方式
//1) 同一个源码文件中 可以多次声明 声明的类在最后一个包中 源码中类所在的位置不需要和包路径相同
//package test

//2)scala中所有语法都可以进行嵌套
//    package可以使用括号 括号内声明的类在这个包中 之外声明的类不在包中

//3)scala中可以生命父包和子包 父包中的类可以被子类直接访问 不需要引入

//4)scala中package可以声明类  不能声明变量和函数

//5)scala为了弥补包的不足 使用包对象  可以声明属性和方法
package test1{

  class Emp{

  }
  /*
  val test = "123"
  def test(){}
  */

  package object test{
    val t1 = "123"
    def t2(){}
  }

  package test2{
    class Scala02_Package {
      def main(args: Array[String]): Unit = {
        println("zzzzzz")
        val emp = new Emp
        println(emp)
      }
    }

  }
}

