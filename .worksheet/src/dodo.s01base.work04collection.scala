package dodo.s01base

object work04collection {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(91); 
  println("Welcome to the Scala worksheet");$skip(32); 

	// 定长
	var v1 = List(1,2,3,4)
	
	
	//	不定长
	import scala.collection.mutable._;System.out.println("""v1  : List[Int] = """ + $show(v1 ));$skip(79); 
	var v2 = ListBuffer(1,2,3,4,4);System.out.println("""v2  : scala.collection.mutable.ListBuffer[Int] = """ + $show(v2 ));$skip(14); 
	v2.append(1);$skip(16); 
	
	var v3 = Nil;System.out.println("""v3  : scala.collection.immutable.Nil.type = """ + $show(v3 ));$skip(26); 
	var v4 = List[Nothing]();System.out.println("""v4  : List[Nothing] = """ + $show(v4 ));$skip(24); 
	
	var v5 = List(5,6,7);System.out.println("""v5  : List[Int] = """ + $show(v5 ));$skip(20); val res$0 = 
	List.concat(v1,v5);System.out.println("""res0: List[Int] = """ + $show(res$0));$skip(16); val res$1 = 
	
	v1:::v5:::v3;System.out.println("""res1: List[Int] = """ + $show(res$1));$skip(21); val res$2 = 
	
	//	返回头元素
	v1.head;System.out.println("""res2: Int = """ + $show(res$2));$skip(22); val res$3 = 
	//	返回头元素以外的
	v1.tail;System.out.println("""res3: List[Int] = """ + $show(res$3));$skip(25); val res$4 = 
	
	// 判断是否为空
	v3.isEmpty;System.out.println("""res4: Boolean = """ + $show(res$4));$skip(31); 
	
	var v6 = List.fill(10)("a");System.out.println("""v6  : List[String] = """ + $show(v6 ));$skip(25); val res$5 = 
	
	List.tabulate(5)(_*2);System.out.println("""res5: List[Int] = """ + $show(res$5));$skip(16); val res$6 = 
	
	
	v1.reverse;System.out.println("""res6: List[Int] = """ + $show(res$6));$skip(11); val res$7 = 
	
	
	v1(1);System.out.println("""res7: Int = """ + $show(res$7));$skip(13); val res$8 = 
	v1.apply(1);System.out.println("""res8: Int = """ + $show(res$8));$skip(24); 
	
	var v7 = v2.distinct;System.out.println("""v7  : scala.collection.mutable.ListBuffer[Int] = """ + $show(v7 ));$skip(14); val res$9 = 
	
	v2.drop(2);System.out.println("""res9: scala.collection.mutable.ListBuffer[Int] = """ + $show(res$9));$skip(17); val res$10 = 
	v2.dropRight(2);System.out.println("""res10: scala.collection.mutable.ListBuffer[Int] = """ + $show(res$10));$skip(39); val res$11 = 
	
	//	占位符，过滤后，得到新的List
	v2.filter(_>2);System.out.println("""res11: scala.collection.mutable.ListBuffer[Int] = """ + $show(res$11));$skip(36); 
	
	//	foreach
	v2.foreach{print(_)};$skip(29); 
	v2.foreach{x=>print(x+" ")};$skip(35); 
	var f22 = {x:Int=>print(x + " ")};System.out.println("""f22  : Int => Unit = """ + $show(f22 ));$skip(17); 
	v2.foreach{f22};$skip(19); val res$12 = 
	
	v2.indexOf(3,0);System.out.println("""res12: Int = """ + $show(res$12));$skip(26); val res$13 = 
	
	//	@* map
	v1.map{_*2};System.out.println("""res13: List[Int] = """ + $show(res$13));$skip(13); val res$14 = 
	v1.map(_*2);System.out.println("""res14: List[Int] = """ + $show(res$14));$skip(32); val res$15 = 

	//	mkString
	v1.mkString(",");System.out.println("""res15: String = """ + $show(res$15));$skip(33); val res$16 = 
	
	//	sortWith
	v1.sortWith(_>_);System.out.println("""res16: List[Int] = """ + $show(res$16))}


}
