package dodo.s00base

class Hello {

  
  
  
  var v1 = Array(1,2,3,4)
  v1.reduceLeft((a,b)=>a+b)
  
  (a:Int, b:Int)=>{a+b}
  
  (a:Int) => a+1
  
  
  
  
  class Person {
    def eat() {}
    def say() {}
    
    def func(){
      def innerfunc(){}
    }
    
    
  }
  
  var p = new Person()
  var p2 = p.func()

  def f2(): Int = { 3 }

  def f5() {}

  def main(args: Array[String]): Unit = {
    for (i <- 1 to 9) {
      for (j <- i to 9) {
        print(i + " * " + j + " = " + i * j + "    ")
      }
      println()
    }
  }

  /**
   * 正常写法
   */
  def xx1(x: Int, y: Int): Int = {
    return x + y
  }
  /**
   * 省略， 返回值类型
   */
  def xx2(x: Int, y: Int) = {
    x + y
  }
  /**
   * 省略， 返回值类型
   */
  def xx3(x: Int, y: Int) = x + y
  def yy() = { " " }

}