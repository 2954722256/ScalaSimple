package dodo.s01base

object work03currying {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(89); 
  println("Welcome to the Scala worksheet");$skip(59); 
  
  def f4(a:Int, b:Int, f:(Int,Int)=>Int)={
		f(a,b)
  };System.out.println("""f4: (a: Int, b: Int, f: (Int, Int) => Int)Int""");$skip(60); 
  
  def f41(a:Int)(b:Int)(f:(Int,Int)=>Int)={
		f(a,b)
  };System.out.println("""f41: (a: Int)(b: Int)(f: (Int, Int) => Int)Int""");$skip(60); 
  
  def f42(a:Int, b:Int)(f:(Int,Int)=>Int)={
		f(a,b)
  };System.out.println("""f42: (a: Int, b: Int)(f: (Int, Int) => Int)Int""");$skip(60); 
  
  def f43(a:Int)(b:Int, f:(Int,Int)=>Int)={
		f(a,b)
  };System.out.println("""f43: (a: Int)(b: Int, f: (Int, Int) => Int)Int""")}










}
