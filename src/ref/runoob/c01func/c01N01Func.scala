package ref.runoob.c01func

object c01N01Func {
  
  
  def main(args: Array[String]): Unit = {
    //  def functionName ([参数列表]) : [return type]
    
    
    
  }
  
  def three = 1+1
  
  
   { i: Int =>
      println("hello world")
      i * 2
   }
  
   { i: Int =>
      println("hello world")
      i * 2
   }
  
  
   (i: Int) => {
      println("hello world")
      i * 2
   }
   
   
  
  /**
   * 方法定义
   */ 
  def do01(){
//    def functionName ([参数列表]) : [return type] = {
//     function body
//     return [expr]
//    }
  }
  
   def addInt( a:Int, b:Int ) : Int = {
      var sum:Int = 0
      sum = a + b

      return sum
   }
  
}