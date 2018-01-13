package dodo.t00

object t07 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(74); 
  println("Welcome to the Scala worksheet");$skip(68); 

	def func09(arr:Int):Int={
		Array.range(1,arr).reduceLeft(_*_)
	};System.out.println("""func09: (arr: Int)Int""");$skip(12); val res$0 = 

	func09(5);System.out.println("""res0: Int = """ + $show(res$0));$skip(15); 

	print("end")}
}
