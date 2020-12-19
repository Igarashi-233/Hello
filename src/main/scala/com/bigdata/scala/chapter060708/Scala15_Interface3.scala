package com.bigdata.scala.chapter060708

//scala没有接口(interface)  但是有类似于接口的特质(trait)
object Scala15_Interface3 {
  def main(args: Array[String]): Unit = {
    val mySQL = new MySQL
    mySQL.insert()
  }
}

trait Operate {

  println("Operate.....")

  def insert(): Unit = {
    println("插入数据")
  }
}

//特质可以继承特质
//重写父特质方法
trait DB extends Operate {

  println("DB.....")

  override def insert(): Unit = {
    println("DB插入数据")
    super.insert()
  }
}

trait File extends Operate {

  println("File.....")

  override def insert(): Unit = {
    println("File插入数据")
    super[Operate].insert()
  }
}

//多特质混入时 代码执行顺序从左到右 存在父特质优先执行
//多特质混入时 方法调用顺序从右到左
//特质中 super 指代上一级特质
//使用super指向父特质 采用特殊操作
//java接口可以在scala中当成特质
class MySQL extends DB with File with Serializable {

}