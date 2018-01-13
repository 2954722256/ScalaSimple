package dodo.t00

object t01 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(74); 
  println("Welcome to the Scala worksheet");$skip(73); 

	def func01(num : Int)={
		for(i <- 0 to num){
			println(num-i)
		}
	};System.out.println("""func01: (num: Int)Unit""");$skip(79); 
	
	def func011(num : Int)={
		for(i <- 0 to num reverse){
			println(i)
		}
	};System.out.println("""func011: (num: Int)Unit""");$skip(14); 
	
	func01(10);$skip(14); 

	func011(10)}


}
