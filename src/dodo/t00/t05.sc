package dodo.t00

object t05 {
  println("Welcome to the Scala worksheet")

	def func05(a : Array[Int]):Array[Int] = {
		for(i<-0 to a.length-1 by 2){
  		var t=a(i)
  		a(i)=a(i+1)
  		a(i+1)=t
  	}
  	return a
	}

print((1,2,3,4,5,6) )


Array.range(1,7)
	//	print(func05(Array.range(1,6) ))
	func05(Array(1,2,3,4,5,6))
	
	
	func05(Array.range(1,7))
	print("end")
	
	
}