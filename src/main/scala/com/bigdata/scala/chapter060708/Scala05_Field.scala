package com.bigdata.scala.chapter060708

import scala.beans.BeanProperty

//类的属性
object Scala05_Field {
  def main(args: Array[String]): Unit = {
    val user = new User05
    //getter
    println(user.username)

    //setter
    user.username = "IGARASHI"

    user.setAddress("xxxx")
    user.getAddress


    //    user.age  无法获取

    //    user.email="igarashi233@sina.com"  无法更改

  }
}

//TODO Scala中有四种访问权限
//1)public 2)protected 3)default(package) 4)private
// public是默认访问权限 没有关键字
// protected 访问权限只能子类访问 同包访问不了
// private 私有访问权限 只能当前类访问
// default 包访问权限采用特殊语法规则 private[包名]

package p1 {
  package p2 {

    class UserP2 {
      var username = "IGARASHI"
      private var password = "123456"
      protected var email = "igarashi233@sina.com"
      private[p3] var address = "XXxxXX"
    }

  }

  package p3 {

    import com.bigdata.scala.chapter060708.p1.p2.UserP2

    class EmpP3 extends UserP2 {
      def test(): Unit = {
        val user = new UserP2
        user.username
        user.address

      }
    }

  }

}

class User05 {

  //scala中给类声明属性 默认为私有 但是底层提供了公共的getter & setter方法
  var username: String = _

  //个属性添加private修饰符  属性无法外部访问  底层生成的两个方法编程私有的了
  private var age: Int = _

  //使用val  属性变为私有  且使用final修饰  底层只提供getter方法 没有setter方法
  val email: String = ""

  //为了和 java bean 规范统一 scala提供了注解 生成java中对应的set get方法
  @BeanProperty var address: String = _

}
