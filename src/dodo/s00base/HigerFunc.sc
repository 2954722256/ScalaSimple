package dodo.s01base

object HigerFunc {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  def f1(a:Int, b:Int, f:(Int, Int)=>Int)={
    f(a,b)
  }                                               //> f1: (a: Int, b: Int, f: (Int, Int) => Int)Int
  
  val fAdd = f1(2,3,(a,b)=>a+b)                   //> fAdd  : Int = 5
  
  
  def f2(a:String, b:String, f:(String, String)=>String)={
    f(a,b)
  }                                               //> f2: (a: String, b: String, f: (String, String) => String)String
  
  val fStr = f2("a","b",(a,b)=>a+b)               //> fStr  : String = ab
  println(fStr)                                   //> ab
  
  def f3(a:String, b:String, f:(String, String)=>String)={
    f(a,b)
  }                                               //> f3: (a: String, b: String, f: (String, String) => String)String
  
  
  var v1=Array(1,2,3,4)                           //> v1  : Array[Int] = Array(1, 2, 3, 4)
  v1 reduceLeft(_+_)                              //> res0: Int = 10
  
  v1                                              //> res1: Array[Int] = Array(1, 2, 3, 4)
  
  
  
  
}