package dodo.t00

object t09 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

	def func09(arr:Array[Int]):Int={
		arr.reduceLeft((a,b)=>(if(a>b){a}else{b}))
	}                                         //> func09: (arr: Array[Int])Int

	func09(Array(3,4,6,8,1,3,1,9))            //> res0: Int = 9

	print("end")
}