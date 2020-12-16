package com.bigdata.scala.chapter05

object Scala03_Function2 {
  def main(args: Array[String]): Unit = {

    // scala采用自动推断功能来简化函数声明
    //函数声明时 明确返回值为Unit 即使有return也不起作用
    def test(): Unit = {
      println("Hello Scala")
      return "IGARASHI"
    }
    println(test())

    //明确return类型  将函数体最后一行代码进行返回  可以省略return关键字
    def test1(): String = {
      "IGARASHI"
//      println("xxxxxxx")   报错
    }
    println(test1())

    //可以根据函数最后一行代码推断 函数类型也可以省略
    def test2()={
      "Kaori"
    }
    println(test2())

    //函数体只有一行代码  函数体大括号也可省略
    def test3() = "Mirai"
    println(test3())

    //函数声明没有参数列表  小括号也可省略
    def test4 = "OMG!"
    println(test4)

    //如果明确函数没有返回值  “=”可以省略  省略后 编译器不会将函数体最后一行作为返回值
    def test5 {
      "IGARASHI"
    }
    println(test5)

    //匿名函数
    ()->{
      println("XXXXXXXXXXXXX")
    }

  }
}
