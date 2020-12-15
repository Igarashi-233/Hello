package com.bigdata.scala.chapter01

object Scala01_Hello{

  //包含main方法  编译后自动形成了psvm
  //scala在编译源码时  会生成两个字节码文件  静态main方法执行另外一个文件中的成员main方法
  //scala是完全面向对象的语言  没有静态的语法  只能通过模拟生成静态方法
  //编译时将当前类生成一个特殊类 ==> Scala01_Hello$  然后创建对象来调用这个对象的main方法

  //一般情况下  将加$的类的对象  成为“伴生对象”
  //“伴生对象”中的内容  都可以通过类明访问  来模拟java中的静态语法

  //“伴生对象”的语法规则  使用 object 声明

  //JAVA: public static void main(String[] arrays) { 方法体 }

  //SCALA: 没有public关键字 默认访问权限全为公共的
  //       没有void关键字  采用特殊对象模拟: Unit
  //       声明方法采用关键字def
  //       方法后的小括号是方法的参数列表  Scala中参数列表的声明方式和Java不同
  //            java--> String 参数名
  //            Scala--> 参数名: 类型
  //       java中方法的声明和方法体直接连接  Scala通过“=”连接
  //       Scala中将方法的返回值类型放置在方法声明的后面用 “:” 连接

  def main(args: Array[String]): Unit = {
    println("Hello World!")

    Scala01_Hello.test()
  }

  def test(): Unit = {

  }
}