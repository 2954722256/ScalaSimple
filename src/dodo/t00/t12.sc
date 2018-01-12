package dodo.t00

object t12 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

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
	}                                         //> largestAt: (fun: Int => Int, inputs: Seq[Int])Int


	var maxIndex = largestAt(x=>10*x-x*x,1 to 10)
                                                  //> maxIndex  : Int = 5

	print("end")
}