package com.bigdata.scala.chapter01

//打印方式
object Scala02_StringPrint {
  def main(args: Array[String]): Unit = {

    println("测试打印")

    //变量
    val name = "ApacheCN"
    val age = 1
    val url = "www.atguigu.com"

    //1.
    println("name=" + name + " age=" + age + " url=" + url)

    //2.
    printf("name=%s, age=%d, url=%s \n", name, age, url)

    //3.
    //    println(s"name=$name, age=$age, url=$url")
    //    print(f"name=$name, age=$age%.2f, url=$url \n")
    print(raw"name=$name, age=$age%.2f, url=$url \n")
  }
}
