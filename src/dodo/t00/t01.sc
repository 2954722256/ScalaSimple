package dodo.t00

object t01 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

	def func01(num : Int)={
		for(i <- 0 to num){
			println(num-i)
		}
	}                                         //> func01: (num: Int)Unit
	
	def func011(num : Int)={
		for(i <- 0 to num reverse){
			println(num)
		}
	}                                         //> func011: (num: Int)Unit
	
	func01(10)                                //> 10
                                                  //| 9
                                                  //| 8
                                                  //| 7
                                                  //| 6
                                                  //| 5
                                                  //| 4
                                                  //| 3
                                                  //| 2
                                                  //| 1
                                                  //| 0

	func011(10)                               //> 10
                                                  //| 10
                                                  //| 10
                                                  //| 10
                                                  //| 10
                                                  //| 10
                                                  //| 10
                                                  //| 10
                                                  //| 10
                                                  //| 10
                                                  //| 10


}