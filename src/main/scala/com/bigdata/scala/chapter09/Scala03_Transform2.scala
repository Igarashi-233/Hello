package com.bigdata.scala.chapter09

object Scala03_Transform2 {
  def main(args: Array[String]): Unit = {

    //隐式值
    //    implicit val username: String = "Mirai"
    implicit val age: Int = 10

    /**
     * 不能重复定义相同隐式值
     * implicit val username1: String = "Kaori"
     */

    //隐式参数
    def test(implicit name: String = "IGARASHI"): Unit = {
      println("Hello " + name)
    }

    def test1(implicit name: String): Unit = {
      println("Hello" + name)
    }

    //    test("IGARASHI")
    test  //隐式参数存在默认值以及对应类型的隐式值 会优先采用隐式值     如果没有与隐式参数对应类型的隐式值 则使用默认值
    test() //方法调用时 括号导致隐式值无法传递

//    test1  隐式参数没有默认值 且隐式值与其类型不匹配 直接报错
    test1("IGARASHI")

  }
}

