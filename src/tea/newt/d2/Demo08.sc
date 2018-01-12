/*
学习List的声明和使用
知识点1：有定长List 和变长的ListBuffer
*/
import scala.collection.mutable._
object Demo08 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  var v1=List(1,2,3,4)                            //> v1  : List[Int] = List(1, 2, 3, 4)
  //需要手动把scala.collection.mutable._导入
  var v2=ListBuffer(1,2,3,4)                      //> v2  : scala.collection.mutable.ListBuffer[Int] = ListBuffer(1, 2, 3, 4)
  
  //声明一个空的定长List
  var v3=Nil                                      //> v3  : scala.collection.immutable.Nil.type = List()
  
  var v4=List[Nothing]()                          //> v4  : List[Nothing] = List()
  
  //从List左侧添加元素
  0 +:v2                                          //> res0: scala.collection.mutable.ListBuffer[Int] = ListBuffer(0, 1, 2, 3, 4)
  //从List右侧添加
  v2 :+5                                          //> res1: scala.collection.mutable.ListBuffer[Int] = ListBuffer(1, 2, 3, 4, 5)
  
  var v5=List(5,6,7)                              //> v5  : List[Int] = List(5, 6, 7)
  
  //--拼接
  List.concat(v1,v5)                              //> res2: List[Int] = List(1, 2, 3, 4, 5, 6, 7)
  //等价于concat拼接
  v1:::v5:::v3                                    //> res3: List[Int] = List(1, 2, 3, 4, 5, 6, 7)
  
  //--返回头元素
  v1.head                                         //> res4: Int = 1
  //--返回除头元素之外的元素，并返回一个List
  v1.tail                                         //> res5: List[Int] = List(2, 3, 4)
  
  //--判断是否为空
  v3.isEmpty                                      //> res6: Boolean = true
  
  //--根据指定数据做指定次数的填充
  //fill()里的数字就是填充次数，也即List的长度
  var v6=List.fill(10)("a")                       //> v6  : List[String] = List(a, a, a, a, a, a, a, a, a, a)
  
  List.tabulate(5)(_*2)                           //> res7: List[Int] = List(0, 2, 4, 6, 8)
  
  v1.reverse                                      //> res8: List[Int] = List(4, 3, 2, 1)
  
  //通过下标取值
  v1(1)                                           //> res9: Int = 2
  //等价于通过下标取值
  v1.apply(1)                                     //> res10: Int = 2
  
  v1.contains(2)                                  //> res11: Boolean = true
  
  var a1=new Array[Int](4)                        //> a1  : Array[Int] = Array(0, 0, 0, 0)
  //--将List数据根据指定的范围下标，拷贝到数组
  v1.copyToArray(a1,0, v1.length)
  a1                                              //> res12: Array[Int] = Array(1, 2, 3, 4)
  
  //--如果要实现全拷贝效果，可以直接调用toArray
  var a2=v1.toArray                               //> a2  : Array[Int] = Array(1, 2, 3, 4)
  
  var v7=List(1,1,1,2,3)                          //> v7  : List[Int] = List(1, 1, 1, 2, 3)
  //--去重
  v7.distinct                                     //> res13: List[Int] = List(1, 2, 3)
  
  //--丢弃前n个元素
  v1.drop(2)                                      //> res14: List[Int] = List(3, 4)
  //--丢弃尾部的n个元素
  v1.dropRight(2)                                 //> res15: List[Int] = List(1, 2)
  
  v1.exists { x => x==2 }                         //> res16: Boolean = true
  
  //--**重点掌握过滤方法，会根据匿名函数的过滤规则，返回一个新的List
  var v8=v1.filter { _>2 }                        //> v8  : List[Int] = List(3, 4)
  
  v1.foreach{println(_)}                          //> 1
                                                  //| 2
                                                  //| 3
                                                  //| 4
  v1.indexOf(3,0)                                 //> res17: Int = 2
 	
 	//--取交集
  v1.intersect(v7)                                //> res18: List[Int] = List(1, 2, 3)
  //--返回最后一个元素
  v1.last                                         //> res19: Int = 4
  
  //--**重点掌握map方法，作用是通过传入的匿名函数，映射成一个新的List返回
  //所有的collection类型，都有map方法
  var v10= v1.map { x => x*2 }                    //> v10  : List[Int] = List(2, 4, 6, 8)
  
  //--**重点掌握，将集合数据以字符串形式返回
  v1.mkString(",")                                //> res20: String = 1,2,3,4
  v1.mkString                                     //> res21: String = 1234
  
  var v11=List(1,10,2,3)                          //> v11  : List[Int] = List(1, 10, 2, 3)
  //降序
  v11.sortWith((a,b)=>a>b)                        //> res22: List[Int] = List(10, 3, 2, 1)
  //升序
  v11.sortWith((a,b)=>a<b)                        //> res23: List[Int] = List(1, 2, 3, 10)
  v11.sortWith(_>_)                               //> res24: List[Int] = List(10, 3, 2, 1)
  v11.sortWith(_<_)                               //> res25: List[Int] = List(1, 2, 3, 10)
  
  v1.sum                                          //> res26: Int = 10
  
}