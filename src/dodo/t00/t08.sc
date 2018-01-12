package dodo.t00
import scala.collection.immutable.ListMap
object t08 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  def values(fun: (Int) => Int, low: Int, high: Int):Map[Int,Int] = {
  	var map = Map[Int,Int]()
    for (i <- low to high) {
      map += (i ->fun(i))
    }
    return map
  }                                               //> values: (fun: Int => Int, low: Int, high: Int)Map[Int,Int]

  val map = values(x => x * x, -5, 5)             //> map  : Map[Int,Int] = Map(0 -> 0, 5 -> 25, -3 -> 9, 1 -> 1, -4 -> 16, 2 -> 4
                                                  //| , -5 -> 25, 3 -> 9, -1 -> 1, 4 -> 16, -2 -> 4)

	ListMap(map.toSeq.sortBy(_._1):_*).toList.toString
                                                  //> res0: String = List((-5,25), (-4,16), (-3,9), (-2,4), (-1,1), (0,0), (1,1), 
                                                  //| (2,4), (3,9), (4,16), (5,25))
  
  print("end")
  
}