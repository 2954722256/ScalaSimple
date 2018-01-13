package dodo.t00

import scala.collection.mutable.ArrayBuffer
import scala.util.Sorting
object t13 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(144); 
  println("Welcome to the Scala worksheet");$skip(520); 

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
  };System.out.println("""func13: (arr: Array[Int])Array[Int]""");$skip(41); val res$0 = 


	func13(Array(1, -2, 0, -3, 0, 4, 5) );System.out.println("""res0: Array[Int] = """ + $show(res$0));$skip(44); val res$1 = 
	func13(Array(1, -2, 0, -3, 0, 4, 5,2,-1) );System.out.println("""res1: Array[Int] = """ + $show(res$1));$skip(217); 

	//	很巧妙，
	def func131(arr:Array[Int])={
			var buf = new ArrayBuffer[Int]();
			buf ++= (for(i<-arr if i>0) yield i)
			buf ++= (for(i<-arr if i==0) yield i)
			buf ++= (for(i<-arr if i<0) yield i)
			buf.toArray
	};System.out.println("""func131: (arr: Array[Int])Array[Int]""");$skip(46); val res$2 = 

	func131(Array(1, -2, 0, -3, 0, 4, 5,2,-1) );System.out.println("""res2: Array[Int] = """ + $show(res$2));$skip(40); val res$3 = 
	func131(Array(1, -2, 0, -3, 0, 4, 5) );System.out.println("""res3: Array[Int] = """ + $show(res$3));$skip(18); 
  
  print("end")}
}
