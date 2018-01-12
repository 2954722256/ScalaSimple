/*
学习scala collection的API操作
知识点1：scala的集合类型包含：array list set map range tuple等

知识点2：每个集合类型都分两种，可变类型和不可变类型。

知识点3：针对array的声明和使用，Array是定长，ArrayBuffer是变长

知识点4：Array的赋值：array(i), ArrayBuffer的赋值通过 append()方法来实现
*/

import Array._
import scala.collection.mutable.ArrayBuffer

object Demo07 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  //声明一个长度为3的定长数组
  var v1=new Array[Int](3)                        //> v1  : Array[Int] = Array(0, 0, 0)
  //声明一个定长数组，并分配元素
  var v2=Array(1,2,3,4)                           //> v2  : Array[Int] = Array(1, 2, 3, 4)
  
  //声明一个变长数组，
  var v3=scala.collection.mutable.ArrayBuffer[Int](3)
                                                  //> v3  : scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(3)
  //声明一个变长数组，并分配元素
  var v4=ArrayBuffer(1,2,3,4)                     //> v4  : scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(1, 2, 3, 4)
  
  //通过下标来进行赋值,定长array是没有append()方法的
  v1(0)=1
  v1(1)=2
  
  
  //注意：针对arryBuffer赋值，为避免越界，建议使用append()方法赋值
  for(i<- 1 to 10){
  	v3.append(i)
  	
  }
  //--Array.concact的作用合并多个array
  Array.concat(v2,v1)                             //> res0: Array[Int] = Array(1, 2, 3, 4, 1, 2, 0)
  //--ArrayBuffer.concat的作用是合并多个ArrayBuffer
  //ArrayBuffer.concat(xss)
  
  //--range()生成区间范围的数组
  Array.range(0,10)                               //> res1: Array[Int] = Array(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
  Array.range(0,10,2)                             //> res2: Array[Int] = Array(0, 2, 4, 6, 8)
  
  //--①参：初始值 ②:迭代次数(数组的长度)
 	Array.iterate(1,10)(_*2)                  //> res3: Array[Int] = Array(1, 2, 4, 8, 16, 32, 64, 128, 256, 512)
 	
 	//--①参：迭代次数(数组的长度)，作用是根据数组下标再结合匿名函数来生成数组元素
 	Array.tabulate(5)(_*2)                    //> res4: Array[Int] = Array(0, 2, 4, 6, 8)
 	
 	v2.sum                                    //> res5: Int = 10
 	v2.max                                    //> res6: Int = 4
 	v2.min                                    //> res7: Int = 1
 	
 	//--通过scala提供的快速排序工具来实现
 	var v5=Array(4,2,1,5)                     //> v5  : Array[Int] = Array(4, 2, 1, 5)
 	scala.util.Sorting.quickSort(v5)
 	v5                                        //> res8: Array[Int] = Array(1, 2, 4, 5)
}