package section.s16buffer

import scala.collection.mutable.ArrayBuffer
import scala.collection.mutable.ListBuffer

object Obj1601buffer {
  def main(args: Array[String]): Unit = {
//    doF01()
    doF02()
  }
  
  
  //buffer 是操作当前buffer
  def doF01(){
    val buffer = ArrayBuffer(1,3,5);
    buffer.append(7)
    println(buffer)
  }
  
  def doF02(){
    val buffer = ListBuffer("a" , "b" , "c" , "d", "e")
    buffer.append("f")
    println(buffer)
  }
  
  
}