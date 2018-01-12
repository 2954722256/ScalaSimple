package dodo.s01base

object work03currying {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  def f4(a:Int, b:Int, f:(Int,Int)=>Int)={
		f(a,b)
  }                                               //> f4: (a: Int, b: Int, f: (Int, Int) => Int)Int
  
  def f41(a:Int)(b:Int)(f:(Int,Int)=>Int)={
		f(a,b)
  }                                               //> f41: (a: Int)(b: Int)(f: (Int, Int) => Int)Int
  
  def f42(a:Int, b:Int)(f:(Int,Int)=>Int)={
		f(a,b)
  }                                               //> f42: (a: Int, b: Int)(f: (Int, Int) => Int)Int
  
  def f43(a:Int)(b:Int, f:(Int,Int)=>Int)={
		f(a,b)
  }                                               //> f43: (a: Int)(b: Int, f: (Int, Int) => Int)Int










}