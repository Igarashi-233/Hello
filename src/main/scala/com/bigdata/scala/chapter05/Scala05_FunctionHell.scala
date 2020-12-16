package com.bigdata.scala.chapter05

object Scala05_FunctionHell {
  def main(args: Array[String]): Unit = {

    //函数式编程 - 地狱级
    //TODO Scala是完全面向函数式编程语言  函数可以做任何事
    //1.函数可以赋值给变量
    //2.函数可以作为函数的参数
    //3.函数可以作为函数的返回值
    def f(): Unit = {
      println("function")
    }

    def f0() = {
      //返回函数
      //直接返回函数本身 不执行
      f _
    }
    f0()()


    //简化
    def f1(i : Int) = {
      def f2(j : Int): Int = {
        println("xxxxxxx")
        i*j
      }

      f2 _
    }
    println(f1(2)(3))

    //TODO 再简化 函数柯里化
    def f3(i:Int)(j:Int):Int = {
      i*j
    }
    println(f3(3)(3))


    //将函数作为参数传递给另外一个函数 需要采用特殊的声明方式
    // 参数列表 => 返回值类型
    def f4( f : Int => Int ) ={
      f(2) + 10
    }
    def f5(i:Int): Int ={
      i*5
    }
    println(f4(f5))


    //匿名函数改善
    def f6(f : ()=> Unit): Unit ={
      f()
    }
    f6(()=>{println("xxxxxx")})

  }
}
