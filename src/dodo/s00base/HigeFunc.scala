package dodo.s00base

object HigeFunc {
  
  
  def f1(a:Int, b:Int, f:(Int, Int)=>Int)={
    f(a,b)  
  }
  
  val fAdd = f1(2,3,(a,b)=>a+b)
  
  
  def f2(a:String, b:String, f:(String, String)=>String)={
    f(a,b)  
  }
  
  val fStr = f2("a","b",(a,b)=>a+b)
  println(fStr)
  
  
  def main(args: Array[String]): Unit = {
    
  }
  
  
  
}