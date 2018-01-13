package dodo.s01base


import java.io.IOException
import util.control.Breaks._
object work04collection {

  //map的赋值：key->value 这种形式
  var v2 = Map("name" -> "tom", "age" -> 23, "gun" -> 20)
                                                  //> v2  : scala.collection.immutable.Map[String,Any] = Map(name -> tom, age -> 2
                                                  //| 3, gun -> 20)

  for ((k, v) <- v2) {
    println(k + ":" + v)                          //> name:tom
                                                  //| age:23
                                                  //| gun:20
  }


	var m1 = Map("book" -> 10, "gun" -> 100, "ipad" -> 1000)
                                                  //> m1  : scala.collection.immutable.Map[String,Int] = Map(book -> 10, gun -> 10
                                                  //| 0, ipad -> 1000)

	var va = "gun11"->222                     //> va  : (String, Int) = (gun11,222)

	m1.+("gun11"->222)                        //> res0: scala.collection.immutable.Map[String,Int] = Map(book -> 10, gun -> 10
                                                  //| 0, ipad -> 1000, gun11 -> 222)

	m1.++(v2)                                 //> res1: scala.collection.immutable.Map[String,Any] = Map(name -> tom, book -> 
                                                  //| 10, age -> 23, gun -> 20, ipad -> 1000)
	
	
	m1.-("gun")                               //> res2: scala.collection.immutable.Map[String,Int] = Map(book -> 10, ipad -> 1
                                                  //| 000)
}