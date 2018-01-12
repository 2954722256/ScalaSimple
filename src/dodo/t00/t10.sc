package dodo.t00

object t10 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

	def func09(arr:Int):Int={
		Array.range(1,arr).reduceLeft(_*_)
	}                                         //> func09: (arr: Int)Int

	func09(5)                                 //> res0: Int = 24

	print("end")
}