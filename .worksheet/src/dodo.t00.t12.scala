package dodo.t00

object t12 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(74); 
  println("Welcome to the Scala worksheet");$skip(199); 

	def largestAt(fun:(Int)=>Int,inputs:Seq[Int]):Int={
		var va = 0;
		var index = 0;
		for(i <- inputs){
			var temp = fun(i)
			if(va < temp){
				va = temp
				index = i
			}
		}
		return index
	};System.out.println("""largestAt: (fun: Int => Int, inputs: Seq[Int])Int""");$skip(49); 


	var maxIndex = largestAt(x=>10*x-x*x,1 to 10);System.out.println("""maxIndex  : Int = """ + $show(maxIndex ));$skip(15); 

	print("end")}
}
