package dodo.t00

object t05 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(74); 
  println("Welcome to the Scala worksheet");$skip(140); 

	def func05(a : Array[Int]):Array[Int] = {
		for(i<-0 to a.length-1 by 2){
  		var t=a(i)
  		a(i)=a(i+1)
  		a(i+1)=t
  	}
  	return a
	};System.out.println("""func05: (a: Array[Int])Array[Int]""");$skip(23); 

print((1,2,3,4,5,6) );$skip(19); val res$0 = 


Array.range(1,7);System.out.println("""res0: Array[Int] = """ + $show(res$0));$skip(65); val res$1 = 
	//	print(func05(Array.range(1,6) ))
	func05(Array(1,2,3,4,5,6));System.out.println("""res1: Array[Int] = """ + $show(res$1));$skip(30); val res$2 = 
	
	
	func05(Array.range(1,7));System.out.println("""res2: Array[Int] = """ + $show(res$2));$skip(14); 
	print("end")}
	
	
}
