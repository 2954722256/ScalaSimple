package section.s15list

/**
 *
 */
object Obj1501list {
  def main(args: Array[String]): Unit = {
    doF01()
  }

  val list00 = "a" :: "b" :: "c" :: "d" :: "e" :: Nil
  val list01 = List(1, 3, 5, 7, 9)

  def doF01() = {
    val list1 = List(1, 3, 5, 7, 9);
    // 注意  : ，通常是右边调用方法， 左边是参数， 所以是Nil的方法， Nil不能省略
    val list2 = "a" :: "b" :: "c" :: "d" :: "e" :: Nil
    for (x <- list2) { println(x) }
  }

  //列表中获取 操作
  //    list(3)		//按下标访问，获取第4个元素，但越往后越慢。
  //		list.head	//list中的第一个元素
  //		list.tail	//list中的除了第一个元素以外的剩余元素
  //		list.length	//获取链表的长度
  //		list.sum	//所有值累加
  def doF02() = {
    println(list00(2))
    println(list00.head)
    println(list00.tail)
    println(list01.sum)
  }

  //常用方法 (不是在原有集合使用的，　　只是创建一个新的集合进行操作)
  def doF03() = {
    val list4 = list00 :+ "f"
    println(list4)
    
    val list5 = "z" +: "y" +: "x" +: list00;
    println(list5)
    
    val list6 = list00.drop(3)
    println(list6)
    
  }

}