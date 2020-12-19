package com.bigdata.scala.chapter060708

//scala没有接口(interface)  但是有类似于接口的特质(trait)
object Scala14_Interface2 {
  def main(args: Array[String]): Unit = {
    new User14
  }
}

//声明特质
//特质和父类没有关系 只和当前混入的类有关系 调用时父类先执行 然后当前混入特质执行 最后当前类执行
// 父类混入相同特质 特质只会在父类执行时执行一次
trait TestTrait14 {
  println("trait code.....")
}

class Person14 extends TestTrait14 {
  println("parent code.....")
}

class User14 extends Person14 with TestTrait14 {
  println("child code.....")
}