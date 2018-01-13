package dodo.s01base


import java.io.IOException
import util.control.Breaks._
import scala.collection.mutable._
object work04collection {

  var v1 = Set(1,2,3)                             //> v1  : scala.collection.mutable.Set[Int] = Set(1, 2, 3)
  
	var v2 = scala.collection.mutable.Set(1,2,3)
                                                  //> v2  : scala.collection.mutable.Set[Int] = Set(1, 2, 3)
  
  var v3 = Set(3,4,5)                             //> v3  : scala.collection.mutable.Set[Int] = Set(5, 3, 4)
  
  //	--取交集
  v1 & v3                                         //> res0: scala.collection.mutable.Set[Int] = Set(3)
  
  //取差集, 相当于 diff
  v1.&~(v3)                                       //> res1: scala.collection.mutable.Set[Int] = Set(1, 2)
  v3.&~(v1)                                       //> res2: scala.collection.mutable.Set[Int] = Set(5, 4)
  v1.diff(v3)                                     //> res3: scala.collection.mutable.Set[Int] = Set(1, 2)
  v1 diff v3                                      //> res4: scala.collection.mutable.Set[Int] = Set(1, 2)
  v3.diff(v1)                                     //> res5: scala.collection.mutable.Set[Int] = Set(5, 4)
  
  //合并2个集合
  var v4 = v1 ++ v3                               //> v4  : scala.collection.mutable.Set[Int] = Set(1, 5, 2, 3, 4)
  
  //2个map
  var a1 = Array(1,2,3,4)                         //> a1  : Array[Int] = Array(1, 2, 3, 4)
  var a2 = Array(4,5,6)                           //> a2  : Array[Int] = Array(4, 5, 6)
  
  
  
  
  
}