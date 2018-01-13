package dodo.t00
import scala.collection.immutable.ListMap
object t08 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(115); 
  println("Welcome to the Scala worksheet");$skip(180); 

  def values(fun: (Int) => Int, low: Int, high: Int):Map[Int,Int] = {
  	var map = Map[Int,Int]()
    for (i <- low to high) {
      map += (i ->fun(i))
    }
    return map
  };System.out.println("""values: (fun: Int => Int, low: Int, high: Int)Map[Int,Int]""");$skip(40); 

  val map = values(x => x * x, -5, 5);System.out.println("""map  : Map[Int,Int] = """ + $show(map ));$skip(53); val res$0 = 

	ListMap(map.toSeq.sortBy(_._1):_*).toList.toString;System.out.println("""res0: String = """ + $show(res$0));$skip(18); 
  
  print("end")}
  
}
