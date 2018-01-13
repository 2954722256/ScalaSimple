package dodo.s01base


import java.io.IOException
import util.control.Breaks._
import scala.collection.mutable._
object work04collection {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(161); 

  var v1 = Set(1,2,3);System.out.println("""v1  : scala.collection.mutable.Set[Int] = """ + $show(v1 ));$skip(49); 
  
	var v2 = scala.collection.mutable.Set(1,2,3);System.out.println("""v2  : scala.collection.mutable.Set[Int] = """ + $show(v2 ));$skip(25); 
  
  var v3 = Set(3,4,5);System.out.println("""v3  : scala.collection.mutable.Set[Int] = """ + $show(v3 ));$skip(24); val res$0 = 
  
  //	--取交集
  v1 & v3;System.out.println("""res0: scala.collection.mutable.Set[Int] = """ + $show(res$0));$skip(33); val res$1 = 
  
  //取差集, 相当于 diff
  v1.&~(v3);System.out.println("""res1: scala.collection.mutable.Set[Int] = """ + $show(res$1));$skip(12); val res$2 = 
  v3.&~(v1);System.out.println("""res2: scala.collection.mutable.Set[Int] = """ + $show(res$2));$skip(14); val res$3 = 
  v1.diff(v3);System.out.println("""res3: scala.collection.mutable.Set[Int] = """ + $show(res$3));$skip(13); val res$4 = 
  v1 diff v3;System.out.println("""res4: scala.collection.mutable.Set[Int] = """ + $show(res$4));$skip(14); val res$5 = 
  v3.diff(v1);System.out.println("""res5: scala.collection.mutable.Set[Int] = """ + $show(res$5));$skip(34); 
  
  //合并2个集合
  var v4 = v1 ++ v3;System.out.println("""v4  : scala.collection.mutable.Set[Int] = """ + $show(v4 ));$skip(39); 
  
  //2个map
  var a1 = Array(1,2,3,4);System.out.println("""a1  : Array[Int] = """ + $show(a1 ));$skip(24); 
  var a2 = Array(4,5,6);System.out.println("""a2  : Array[Int] = """ + $show(a2 ))}
  
  
  
  
  
}
