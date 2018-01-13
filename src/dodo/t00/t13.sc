package dodo.t00

import scala.collection.mutable.ArrayBuffer
import scala.util.Sorting
object t13 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  def func13(arr: Array[Int]): Array[Int] = {
    var arrZ = ArrayBuffer[Int]()
    var arr0 = ArrayBuffer[Int]()
    var arrF = ArrayBuffer[Int]()

    arr.foreach {
      x =>
        {
          if (x > 0) {
            arrZ.append(x)
          } else if (x == 0) {
            arr0.append(x)
          } else {
            arrF.append(x)
          }
        }
    }
    //arrZ.sortWith(_<_).toArray
    
    var result = ArrayBuffer.concat(arrZ.sortWith(_<_),arr0,arrF.sortWith(_>_)).toArray

    return result
  }                                               //> func13: (arr: Array[Int])Array[Int]


	func13(Array(1, -2, 0, -3, 0, 4, 5) )     //> res0: Array[Int] = Array(1, 4, 5, 0, 0, -2, -3)
	func13(Array(1, -2, 0, -3, 0, 4, 5,2,-1) )//> res1: Array[Int] = Array(1, 2, 4, 5, 0, 0, -1, -2, -3)

	//	很巧妙，
	def func131(arr:Array[Int])={
			var buf = new ArrayBuffer[Int]();
			buf ++= (for(i<-arr if i>0) yield i)
			buf ++= (for(i<-arr if i==0) yield i)
			buf ++= (for(i<-arr if i<0) yield i)
			buf.toArray
	}                                         //> func131: (arr: Array[Int])Array[Int]

	func131(Array(1, -2, 0, -3, 0, 4, 5,2,-1) )
                                                  //> res2: Array[Int] = Array(1, 4, 5, 2, 0, 0, -2, -3, -1)
	func131(Array(1, -2, 0, -3, 0, 4, 5) )    //> res3: Array[Int] = Array(1, 4, 5, 0, 0, -2, -3)
  
  print("end")
}