package com.bigdata.scala.chapter060708

//类的方法
object Scala07_Method2 {
  def main(args: Array[String]): Unit = {
    //采用伴生对象创建伴生类
    val student = Student()
    println(student)
//    student.test()
    student()
    student.Stu()
    val sname = student.sname
    println(sname)

  }
}
