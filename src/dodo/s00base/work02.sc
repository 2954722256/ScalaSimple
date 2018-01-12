package dodo.s01base

object work2 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  
  def f1(n:Int):Int={
  	if(n==0) return 1
  	if(n==1) return 1
  	else f1(n-1)+f1(n-2)
  }                                               //> f1: (n: Int)Int
  f1(7)                                           //> res0: Int = 21
  f1(8)                                           //> res1: Int = 34
  
  
  def F2(n:Int):Int={
  	if(n==0) return 2
  	if(n==1) return 3
  	else F2(n-2)*F2(n-2)
  }                                               //> F2: (n: Int)Int
  
  F2(2)                                           //> res2: Int = 4
  
  
  def f3(n:Int):Int={
  	if(n==0) return 2
  	if(n==1) return 3
  	if(n%2==0){
  		return 2*f3(n-2)
  	}else{
  		return 3*f3(n-2)
  	}
  }                                               //> f3: (n: Int)Int
  
  f3(4)                                           //> res3: Int = 8

	
	def f4(n:Int):Int={
		if(n==1) return 1
		else f4(n-1)+n
	}                                         //> f4: (n: Int)Int
	//第n个数
	def ff4(n:Int):Int={
		return n
	}                                         //> ff4: (n: Int)Int
	
	f4(10)                                    //> res4: Int = 55


	lazy val v2 = 7                           //> v2: => Int

}