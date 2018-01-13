package dodo.t00

object t04 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(74); 
  println("Welcome to the Scala worksheet");$skip(201); 

	def mi(x:Int, n:Int):Double={
		var total = 1.0
		if(n==0){
			return total
		}
		var nn = if(n>0){n}else{-n}
		for(i<-1 to nn){
			total *= x
		}
		if(n<0){
			total = 1/total
		}
		return total
	};System.out.println("""mi: (x: Int, n: Int)Double""");$skip(17); 

	print(mi(2,3));$skip(17); 

	print(mi(0,3));$skip(18); 
	
	print(mi(3,3));$skip(18); 
	
	print(mi(1,5));$skip(19); 
	
	print(mi(-2,3));$skip(19); 
	
	print(mi(-2,4));$skip(20); 
	
	print(mi(-2,-1));$skip(16); 
	
	print("end")}
	

}
