package section.s7

import java.io.IOException

object Obj704try {
  def main(args: Array[String]): Unit = {
//    do01()
//    do02()
    
  }

  def do01() = {
    val result = try {
      throw new IOException;
    } catch {
      case t: NullPointerException => t.printStackTrace()// TODO: handle error
      case t: ClassNotFoundException => t.printStackTrace()// TODO: handle error
      case t: Throwable => t.printStackTrace()// TODO: handle error
      case t: IOException => t.printStackTrace()// TODO: handle error
    }finally {
      println("无论什么时候， 都可以执行！！"); 
    }
    
    println(result)
  }
  
  
  def do02() = {
    val result = try {
      throw new IOException;
    } catch {
      case t: NullPointerException => "没毛病NullPointerException"// TODO: handle error
      case t: ClassNotFoundException => "没毛病ClassNotFoundException"// TODO: handle error
      case t: Throwable => "没毛病Throwable"// TODO: handle error
      case t: IOException => "没毛病IOException"// TODO: handle error
    }finally {
      "无论什么时候， 都可以执行！！"
    }
    
    println(result)
  }
  
  
}