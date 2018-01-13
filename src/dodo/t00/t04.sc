package dodo.t00

object t04 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

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
	}                                         //> mi: (x: Int, n: Int)Double

	print(mi(2,3))                            //> 8.0

	print(mi(0,3))                            //> 0.0
	
	print(mi(3,3))                            //> 27.0
	
	print(mi(1,5))                            //> 1.0
	
	print(mi(-2,3))                           //> -8.0
	
	print(mi(-2,4))                           //> 16.0
	
	print(mi(-2,-1))                          //> -0.5
	
	print("end")
	

}