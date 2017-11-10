package section.s20map

object Obj2001map {
  def main(args: Array[String]): Unit = {
    doF01()
  }

  def doF01() = {
    //　创建map
    val m1 = Map(1 -> "", 2 -> "", 3 -> "")
    println(m1)

    //
//    val m2 =

    //遍历map
       //key-value遍历
    for (key <- m1.keySet) {
      val value = m1.getOrElse(key, "")
      println(key + "~" + value)
    }
      //tuple遍历
    for(t <- m1){
      println(t._1+"~"+t._2)      
    }
    
//    //zip操作
//    val k1 = 
    
  }
}