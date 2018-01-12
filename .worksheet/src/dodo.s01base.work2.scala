package dodo.s01base

object work2 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(80); 
  println("Welcome to the Scala worksheet");$skip(98); 
  
  
  def f1(n:Int):Int={
  	if(n==0) return 1
  	if(n==1) return 1
  	else f1(n-1)+f1(n-2)
  };System.out.println("""f1: (n: Int)Int""");$skip(8); val res$0 = 
  f1(7);System.out.println("""res0: Int = """ + $show(res$0));$skip(8); val res$1 = 
  f1(8);System.out.println("""res1: Int = """ + $show(res$1));$skip(98); 
  
  
  def F2(n:Int):Int={
  	if(n==0) return 2
  	if(n==1) return 3
  	else F2(n-2)*F2(n-2)
  };System.out.println("""F2: (n: Int)Int""");$skip(11); val res$2 = 
  
  F2(2);System.out.println("""res2: Int = """ + $show(res$2));$skip(146); 
  
  
  def f3(n:Int):Int={
  	if(n==0) return 2
  	if(n==1) return 3
  	if(n%2==0){
  		return 2*f3(n-2)
  	}else{
  		return 3*f3(n-2)
  	}
  };System.out.println("""f3: (n: Int)Int""");$skip(11); val res$3 = 
  
  f3(4);System.out.println("""res3: Int = """ + $show(res$3));$skip(64); 

	
	def f4(n:Int):Int={
		if(n==1) return 1
		else f4(n-1)+n
	};System.out.println("""f4: (n: Int)Int""");$skip(44); 
	//第n个数
	def ff4(n:Int):Int={
		return n
	};System.out.println("""ff4: (n: Int)Int""");$skip(11); val res$4 = 
	
	f4(10);System.out.println("""res4: Int = """ + $show(res$4));$skip(19); 


	lazy val v2 = 7;System.out.println("""v2: => Int""")}

}
