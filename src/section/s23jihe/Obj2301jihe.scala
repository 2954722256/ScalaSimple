package section.s23jihe

object Obj2301jihe {
  def main(args: Array[String]): Unit = {
    doF01()
  }

  def doF01() = {
    val list1 = List(1,3,5,7);
    val list2 = List(5,7,9,10);
    
    //差集
    val result1 = list1.diff(list2)
    println(result)
  }
}