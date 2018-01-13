package dodo.t00

object t09 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(74); 
  println("Welcome to the Scala worksheet");$skip(83); 

	def func09(arr:Array[Int]):Int={
		arr.reduceLeft((a,b)=>(if(a>b){a}else{b}))
	};System.out.println("""func09: (arr: Array[Int])Int""");$skip(33); val res$0 = 

	func09(Array(3,4,6,8,1,3,1,9));System.out.println("""res0: Int = """ + $show(res$0));$skip(15); 

	print("end")}
}
