package com.bigdata.scala.chapter060708

//scala没有接口(interface)  但是有类似于接口的特质(trait)
object Scala18_ClassInfo {
  def main(args: Array[String]): Unit = {
    //TODO Scala想要获取类信息 采用特殊方法 classOf[类型]
    val value = classOf[User18]

    //    value.getInterfaces

    //type可以给类起别名
    type xxx = User18

    val user: Object = new xxx
    //判断类型
    val bool = user.isInstanceOf[xxx]
    if (bool) {
      //转换类型 测试asInstanceOf (bool 不能转 user)
      val user1 = bool.asInstanceOf[xxx]
      println(user1)
    }

  }
}

class User18 {

}