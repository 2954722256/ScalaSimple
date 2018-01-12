package dodo.t00

object t03 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

	def countdown(n:Int)={
		for(i<-0 to n reverse){
			println(i)
		}
	}                                         //> countdown: (n: Int)Unit
	
	countdown(10)                             //> 10
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


	def countdown2(n:Int)={
		for(i<-0 to n reverse;val flag=if(i!=0)" "else"end"){
			print(i+flag)
		}
	}                                         //> countdown2: (n: Int)Unit

	countdown2(10)                            //> 10 9 8 7 6 5 4 3 2 1 0end
		
		countdown(10)                     //> 10
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
	
}