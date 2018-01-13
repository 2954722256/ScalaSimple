package dodo.t00

object t06 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(75); 
  println("Welcome to the Scala worksheet");$skip(283); 

  def func06(map: Map[String, Int]): Map[String, Int] = {
    var reMap = Map[String, Int]()
    var percent = 0.9

    map.keys.foreach {
      k =>
        {
          print(k + " ")
          reMap += (k -> (map(k) * percent).intValue())
        }
    }

    return reMap
  };System.out.println("""func06: (map: Map[String,Int])Map[String,Int]""");$skip(198); 

  def func061(map: Map[String, Int]): Map[String, Int] = {
    var percent = 0.9
		var reMap = Map[String, Int]()
		for((k,v)<-map){
			reMap += (k->v*percent.intValue())
		}
    return reMap
  };System.out.println("""func061: (map: Map[String,Int])Map[String,Int]""");$skip(61); 

  var m1 = Map("book" -> 10, "gun" -> 100, "ipad" -> 1000);System.out.println("""m1  : scala.collection.immutable.Map[String,Int] = """ + $show(m1 ));$skip(13); val res$0 = 
  func06(m1);System.out.println("""res0: Map[String,Int] = """ + $show(res$0));$skip(15); val res$1 = 


	func061(m1);System.out.println("""res1: Map[String,Int] = """ + $show(res$1));$skip(17); 

  print("end")}
}
