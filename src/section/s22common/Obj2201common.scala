package section.s22common

object Obj2201common {
  def main(args: Array[String]): Unit = {
    doF01()
  }
  
  def doF01() = {
    val list1 = List(1,3,5,7,9);
    val r1 = list1.exists(_%2==0);
    println(r1)
    
    val list2 = list1 :+ 100;
    val r2 = list2.exists(_%2==0);
    println(r2)
  }
}