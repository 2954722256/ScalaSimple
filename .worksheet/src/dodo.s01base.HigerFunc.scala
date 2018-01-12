package dodo.s01base

object HigerFunc {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(84); 
  println("Welcome to the Scala worksheet");$skip(62); 
  
  def f1(a:Int, b:Int, f:(Int, Int)=>Int)={
    f(a,b)
  };System.out.println("""f1: (a: Int, b: Int, f: (Int, Int) => Int)Int""");$skip(35); 
  
  val fAdd = f1(2,3,(a,b)=>a+b);System.out.println("""fAdd  : Int = """ + $show(fAdd ));$skip(80); 
  
  
  def f2(a:String, b:String, f:(String, String)=>String)={
    f(a,b)
  };System.out.println("""f2: (a: String, b: String, f: (String, String) => String)String""");$skip(39); 
  
  val fStr = f2("a","b",(a,b)=>a+b);System.out.println("""fStr  : String = """ + $show(fStr ));$skip(16); 
  println(fStr);$skip(77); 
  
  def f3(a:String, b:String, f:(String, String)=>String)={
    f(a,b)
  };System.out.println("""f3: (a: String, b: String, f: (String, String) => String)String""");$skip(31); 
  
  
  var v1=Array(1,2,3,4);System.out.println("""v1  : Array[Int] = """ + $show(v1 ));$skip(21); val res$0 = 
  v1 reduceLeft(_+_);System.out.println("""res0: Int = """ + $show(res$0));$skip(8); val res$1 = 
  
  v1;System.out.println("""res1: Array[Int] = """ + $show(res$1))}
  
  
  
  
}
