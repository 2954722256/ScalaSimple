package dodo.t00

object t11 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(74); 
  println("Welcome to the Scala worksheet");$skip(163); 

	def largest(fun:(Int)=>Int,inputs:Seq[Int]):Int={
		var va = 0;
		for(i <- inputs){
			var temp = fun(i)
			if(va < temp){
				va = temp
			}
		}
		return va
	};System.out.println("""largest: (fun: Int => Int, inputs: Seq[Int])Int""");$skip(42); 


	var max = largest(x=>10*x-x*x,1 to 10);System.out.println("""max  : Int = """ + $show(max ));$skip(15); 

	print("end")}
}
