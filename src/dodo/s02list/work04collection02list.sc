package dodo.s01base

object work04collection {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

	// 定长
	var v1 = List(1,2,3,4)                    //> v1  : List[Int] = List(1, 2, 3, 4)
	
	
	//	不定长
	import scala.collection.mutable._
	var v2 = ListBuffer(1,2,3,4,4)            //> v2  : scala.collection.mutable.ListBuffer[Int] = ListBuffer(1, 2, 3, 4, 4)
	v2.append(1)
	
	var v3 = Nil                              //> v3  : scala.collection.immutable.Nil.type = List()
	var v4 = List[Nothing]()                  //> v4  : List[Nothing] = List()
	
	var v5 = List(5,6,7)                      //> v5  : List[Int] = List(5, 6, 7)
	List.concat(v1,v5)                        //> res0: List[Int] = List(1, 2, 3, 4, 5, 6, 7)
	
	v1:::v5:::v3                              //> res1: List[Int] = List(1, 2, 3, 4, 5, 6, 7)
	
	//	返回头元素
	v1.head                                   //> res2: Int = 1
	//	返回头元素以外的
	v1.tail                                   //> res3: List[Int] = List(2, 3, 4)
	
	// 判断是否为空
	v3.isEmpty                                //> res4: Boolean = true
	
	var v6 = List.fill(10)("a")               //> v6  : List[String] = List(a, a, a, a, a, a, a, a, a, a)
	
	List.tabulate(5)(_*2)                     //> res5: List[Int] = List(0, 2, 4, 6, 8)
	
	
	v1.reverse                                //> res6: List[Int] = List(4, 3, 2, 1)
	
	
	v1(1)                                     //> res7: Int = 2
	v1.apply(1)                               //> res8: Int = 2
	
	var v7 = v2.distinct                      //> v7  : scala.collection.mutable.ListBuffer[Int] = ListBuffer(1, 2, 3, 4)
	
	v2.drop(2)                                //> res9: scala.collection.mutable.ListBuffer[Int] = ListBuffer(3, 4, 4, 1)
	v2.dropRight(2)                           //> res10: scala.collection.mutable.ListBuffer[Int] = ListBuffer(1, 2, 3, 4)
	
	//	占位符，过滤后，得到新的List
	v2.filter(_>2)                            //> res11: scala.collection.mutable.ListBuffer[Int] = ListBuffer(3, 4, 4)
	
	//	foreach
	v2.foreach{print(_)}                      //> 123441
	v2.foreach{x=>print(x+" ")}               //> 1 2 3 4 4 1 
	var f22 = {x:Int=>print(x + " ")}         //> f22  : Int => Unit = <function1>
	v2.foreach{f22}                           //> 1 2 3 4 4 1 
	
	v2.indexOf(3,0)                           //> res12: Int = 2
	
	//	@* map
	v1.map{_*2}                               //> res13: List[Int] = List(2, 4, 6, 8)
	v1.map(_*2)                               //> res14: List[Int] = List(2, 4, 6, 8)

	//	mkString
	v1.mkString(",")                          //> res15: String = 1,2,3,4
	
	//	sortWith
	v1.sortWith(_>_)                          //> res16: List[Int] = List(4, 3, 2, 1)


}