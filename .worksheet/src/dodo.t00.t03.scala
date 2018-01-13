package dodo.t00

object t03 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(74); 
  println("Welcome to the Scala worksheet");$skip(72); 

	def countdown(n:Int)={
		for(i<-0 to n reverse){
			println(i)
		}
	};System.out.println("""countdown: (n: Int)Unit""");$skip(17); 
	
	countdown(10);$skip(107); 


	def countdown2(n:Int)={
		for(i<-0 to n reverse;val flag=if(i!=0)" "else"end"){
			print(i+flag)
		}
	};System.out.println("""countdown2: (n: Int)Unit""");$skip(17); 

	countdown2(10);$skip(19); 
		
		countdown(10)}
	
}
