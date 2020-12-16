package com.bigdata.scala.chapter05

object Scala02_Function1 {
  def main(args: Array[String]): Unit = {
    //函数  入参(方法参数) 出参(返回值)
    //无参  无返回值
    def test() = {
      println("Test")
    }

    test()

    //有参 无返回值
    //在同一个作用域中 函数不能重名
    def test1(s: String) = {
      println(s)
    }

    test1("IGARASHI")

    //有参 有返回值
    def test2(s: String): String = {
      return s+"...."
    }
    val rtnVal = test2("IGARASHI")
    println(rtnVal)

    //无参  有返回值
    def test3(): String ={
      return "Hello World!"
    }
    println(test3())

    //函数中有异常发生 不需要在函数声明时抛出异常

  }
}
