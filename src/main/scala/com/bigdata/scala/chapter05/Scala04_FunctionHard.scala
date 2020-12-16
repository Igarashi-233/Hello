package com.bigdata.scala.chapter05

object Scala04_FunctionHard {
  def main(args: Array[String]): Unit = {

    //函数式编程 - 扩展
    def test(name : String*): Unit ={
      println(name)
    }
    //调用函数时  可以传多个参数  可以不传
    test("IGARASHI", "MIRAI", "KAORI")
    test()

    //默认参数
    def test1(name : String, age : Int = 20): Unit ={
      println(s"$name - $age")
    }
    test1("IGARASHI", 233)

    //带名参数
    //调用函数时 参数匹配规则时从前到后 从左到右
    def test2(name2 : String = "kaori", name1 : String): Unit ={
      println(s"$name1 - $name2")
    }
    test2(name1 = "IGARASHI")

  }
}
