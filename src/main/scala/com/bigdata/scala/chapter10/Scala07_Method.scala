package com.bigdata.scala.chapter10

object Scala07_Method {
  def main(args: Array[String]): Unit = {

    //集合中常用方法
    val list = List(1, 2, 5, 4, 2, 1, 1, 2, 7, 8, 2)

    //TODO 最大值
    println("Max")
    println("max = " + list.max)

    //TODO 最小值
    println("\n Min")
    println("min = " + list.min)

    //TODO 求和
    println("\n Sum")
    println("sum = " + list.sum)

    //TODO 求乘积
    println("\n Product")
    println("product = " + list.product)

    //TODO 反转 不排序
    println("\n Reverse")
    println("reverse = " + list.reverse)

    //TODO 分组 (通过指定函数的返回值进行分组)
    println("\n GroupBy")
    /*    val intToInts: Map[Int, List[Int]] = list.groupBy(x => x)
        intToInts.foreach(t => {
          println(t._1 + "-" + t._2)
        })    */
    val stringList = List("11", "22", "33", "44", "43", "32", "21")
    val stringToStrings: Map[String, List[String]] = stringList.groupBy(s => {
      s.substring(0, 1)
    })
    stringToStrings.foreach(t => {
      println(t._1 + "-" + t._2)
    })

    //TODO 排序 (通过制定规则排序 升序)
    println("\n SortBy")
    val sortList: List[Int] = list.sortBy(i => i)
    println(sortList.mkString(","))

    val sortByStringList: List[String] = stringList.sortBy(si => {
      si.substring(1)
    })
    println(sortByStringList.mkString(","))

    //TODO 自定义升序降序  x<y 升序   x>y 降序
    println("\n SortWith")
    val ints: List[Int] = list.sortWith((x, y) => {
      x > y
    })
    println(ints.mkString(","))
    //获取集合前n个
    println(ints.take(5))

    val sortWithStringList: List[String] = stringList.sortWith((left, right) => {
      left.substring(1).toInt > right.substring(1).toInt
    })
    println(sortWithStringList.mkString(","))

    //TODO 迭代
    println("\n Iterator")
    for (elem <- list.iterator) {
      println(elem)
    }

    //TODO 映射 (转换)
    println("\n Map")
    // x=>(x,x) 映射为元组
    val tuples: List[(Int, Int)] = list.map(x => {
      (x, x)
    })
    println(tuples.mkString(","))
    val intToTuples: Map[Int, List[(Int, Int)]] = tuples.groupBy(t => {
      t._1
    })
    println(intToTuples.mkString(","))
    val intToInt: Map[Int, Int] = intToTuples.map(m => {
      (m._1, m._2.size)
    })
    println(intToInt.mkString(","))




    //TODO WordCount
    //对集合中单词个数进行统计  并且按照出现次数降序排列 取前三名
    println("\n -----------------WordCount Start------------------")
    val wordList = List("Hello", "Scala", "Hello", "World", "Hadoop", "Kafka", "Scala", "Hbase", "Scala", "World")

    //1) 将相同单词放在一起 groupBy
    //      (Hello , List("Hello","Hello"......))
    val wordToListMap: Map[String, List[String]] = wordList.groupBy(word => word)

    //2) 将数据结构进行转换 Map
    //      (Hello, wordcount=list.size)
    val wordToCountMap: Map[String, Int] = wordToListMap.map(t => {
      (t._1, t._2.size)
    })

    //3) 将数据进行排序 降序 x>y
    //      Map无序  转成List后才能排序
    // List( (k1,v1), (k2,v2)......... )   对v进行排序
    val sortMapList: List[(String, Int)] = wordToCountMap.toList.sortWith((left, right) => {
      left._2 > right._2
    })

    //4) 去完成后的前三条数据 take()
    val resultList: List[(String, Int)] = sortMapList.take(3)
    println(resultList.mkString(","))


    //TODO 扁平化 将整体中的内容拆分成单个个体
    val lineList = List("Hello World", "Hello List", "Hello Scala", "Scala Hadoop")
    println("扁平化 before :" + lineList)

    //list => a,b,c......
    val flatMapList: List[String] = lineList.flatMap(x => x.split(" "))
    println("扁平化 after :" + flatMapList)

    val result: List[(String, Int)] = flatMapList.groupBy(word => word).map(t => {
      (t._1, t._2.size)
    }).toList.sortWith((left, right) => {
      left._2 > right._2
    })
    println(result.mkString(","))

    println("-----------------WordCount End------------------- \n")


  }
}
