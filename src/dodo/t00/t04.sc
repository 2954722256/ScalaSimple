package dodo.t00

object t04 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

	def mi(x:Int, n:Int):Int={
		var total = 1
		for(i<-1 to n){
			total *= x
		}
		return total
	}                                         //> mi: (x: Int, n: Int)Int

	print(mi(2,3))                            //> 8

	print(mi(0,3))                            //> 0
	
	print(mi(3,3))                            //> 27
	
	print(mi(1,5))                            //> 1
	
	print(mi(-2,3))                           //> -8
	
	print(mi(-2,4))                           //> 16
	
	print("end")

}