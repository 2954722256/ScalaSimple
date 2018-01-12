package dodo.t00

object t07 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

	def func06(str1:String, str2:String)={
		str1.zip(str2)
	}                                         //> func06: (str1: String, str2: String)scala.collection.immutable.IndexedSeq[(C
                                                  //| har, Char)]

	func06("hello", "world")                  //> res0: scala.collection.immutable.IndexedSeq[(Char, Char)] = Vector((h,w), (e
                                                  //| ,o), (l,r), (l,l), (o,d))

	print("end")
}