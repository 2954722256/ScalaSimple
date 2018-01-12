package dodo.t00

object t11 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

	def largest(fun:(Int)=>Int,inputs:Seq[Int]):Int={
		var va = 0;
		for(i <- inputs){
			var temp = fun(i)
			if(va < temp){
				va = temp
			}
		}
		return va
	}                                         //> largest: (fun: Int => Int, inputs: Seq[Int])Int


	var max = largest(x=>10*x-x*x,1 to 10)    //> max  : Int = 25

	print("end")
}