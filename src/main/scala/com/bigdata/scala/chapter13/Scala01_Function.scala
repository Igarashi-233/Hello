package com.bigdata.scala.chapter13

object Scala01_Function {
  def main(args: Array[String]): Unit = {

    val list = List(1, 2, 3, 4, "abc")

    val list1 = list.map(any => {
      if (any.isInstanceOf[Int]) {
        any.asInstanceOf[Int] + 1
      }
    })
    println(list1)

    val list2 = list1.filter(x => x.isInstanceOf[Int])
    println(list2)


    //说明
    val addOne3 = new PartialFunction[Any, Int] {
      def isDefinedAt(any: Any) = {
        if (any.isInstanceOf[Int]) true
        else false
      }

      def apply(any: Any) = any.asInstanceOf[Int] + 1
    }
    //收集满足条件的数据 collect函数支持偏函数
    val list3 = list.collect(addOne3)
    println("list3=" + list3)

    val list4 = list.collect {
      case i: Int => i + 1
    }
    println("list4=" + list4)

    val strings = list.map {
      case num => num + "xxxx"
    }
    println(strings)

    val list5 = list.sortWith {
      case (left, right) => {
        left.toString > right.toString
      }
    }
    println(list5)


  }
}
