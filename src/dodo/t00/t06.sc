package dodo.t00

object t06 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  def func06(map: Map[String, Int]): Map[String, Int] = {
		var reMap = Map[String, Int]()
		var percent = 0.9
		
    map.keys.foreach {
      k => {
      	print(k + " ")
      	reMap += (k->(map(k)*percent).intValue())
      }
    }

    return reMap
  }                                               //> func06: (map: Map[String,Int])Map[String,Int]


	var m1=Map("book"->10,"gun"->100,"ipad"->1000)
                                                  //> m1  : scala.collection.immutable.Map[String,Int] = Map(book -> 10, gun -> 10
                                                  //| 0, ipad -> 1000)
	func06(m1)                                //> book gun ipad res0: Map[String,Int] = Map(book -> 9, gun -> 90, ipad -> 900)
                                                  //| 

  print("end")
}