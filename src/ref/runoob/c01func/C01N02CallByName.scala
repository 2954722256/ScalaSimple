package ref.runoob.c01func

object C01N02CallByName {
//    Scala的解释器在解析函数参数(function arguments)时有两种方式：
//    传值调用（call-by-value）：先计算参数表达式的值，再应用到函数内部；
//    传名调用（call-by-name）：将未计算的参数表达式直接应用到函数内部
  
  
  def main(args: Array[String]): Unit = {
    delayed(time());
  }
  
  def time() = {
      println("获取时间，单位为纳秒")
      System.nanoTime
  }
  
  
   def delayed( t: => Long ) = {
      println("在 delayed 方法内")
      println("参数： " + t)
      t
   }
   
   
   def delayed02( t: => Long ) : Long = {
      println("在 delayed 方法内")
      println("参数： " + t)
      t
   }
}