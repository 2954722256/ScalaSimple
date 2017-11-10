package section.s22common

object Obj2201common {
  def main(args: Array[String]): Unit = {
    doF03()
  }
  
  //集合是否存在 exists
  def doF01() = {
    val list1 = List(1,3,5,7,9);
    val r1 = list1.exists(_%2==0);
    println(r1)
    
    val list2 = list1 :+ 100;
    val r2 = list2.exists(_%2==0);
    println(r2)
  }
  
  def doF02() = {
    
  }
  
  // 去重  distinct
  def doF03() = {
    val list3 = List(1,2,3,4,5,3,2);  
    val r3 = list3.distinct
    println(r3)
  }
  
  def doF04(){
    
  }
  
  def doF05() = {
    
  }
  
  def doF06(){
    val list6 = List(1,3,5,7);
    val list7 = List(5,7,9,10);
    
    //
    val result7 = list6.diff(list7)
    
  }
  
  
  
  
}