package com.bigdata.scala.chapter060708

//构造方法
object Scala11_Class2 {
  def main(args: Array[String]): Unit = {
    val user = new User11("123")
    println(user.name)
  }
}

//类构造方法的参数的作用域默认为整个类主体  若参数作为属性使用 需要采用特殊声明方式
class User11(var name: String) {

}
