/*
*用来测试scala变量（var)和常量（val）的使用
知识点1：scala能够自动推断变量或常量的类型，不需要进行声明
知识点2：常量用val来声明，已经声明，不可改变
知识点3：scala可以无缝衔接java的类库方法，此外，scala有个隐式隐式转换的概念，比如当调用 字符串的 *方法时
scala会隐式的转换为scala的StringOps类型，这个类提供了非常丰富的方法
知识点4：scala中，都是对象和方法，没有基本数据类型的概念，所以有人说scala要比java的面向对象更为彻底
知识点5：scala支持java中的8中基本类型，当调用这些类型时，比如int时，
scala用的是自己的类型，比如：int->RichInt,double->RichDouble ……
知识点6：学习scala最好的教材是scala doc
<http://www.scala-lang.org/api>
*/
object Demo01 {
  var v1="hello"                                  //> v1  : String = hello
  var v2=10                                       //> v2  : Int = 10
  var v3:String="world"                           //> v3  : String = world
  var v4:Int=20                                   //> v4  : Int = 20
  var v5:java.lang.String="hello"                 //> v5  : String = hello
  
  val v6=30                                       //> v6  : Int = 30
  
  v1.split("l")                                   //> res0: Array[String] = Array(he, "", o)
  v1*3                                            //> res1: String = hellohellohello
  v1.drop(2)                                      //> res2: String = llo
  v1.dropRight(2)                                 //> res3: String = hel
  v1.concat("world")                              //> res4: String = helloworld
  v1.count { x => x=='l' }                        //> res5: Int = 2
  v1.filter { x =>x!='l' }                        //> res6: String = heo
  v1.exists { x =>x=='t' }                        //> res7: Boolean = false
  v1.foreach{x=>println(x)}                       //> h
                                                  //| e
                                                  //| l
                                                  //| l
                                                  //| o
  v1.max                                          //> res8: Char = o
  v1.min                                          //> res9: Char = e
  v1.head                                         //> res10: Char = h
  v1.last                                         //> res11: Char = o
  
  v1.mkString(",")                                //> res12: String = h,e,l,l,o
  v1.reverse                                      //> res13: String = olleh
  
  //0000 1010
  //0000 0101
  //0000 1111
  v2.&(5)                                         //> res14: Int = 0
  v2.^(5)                                         //> res15: Int = 15
  
  //生成区间范围，并可以指定步长
  v2.to(30)                                       //> res16: scala.collection.immutable.Range.Inclusive = Range(10, 11, 12, 13, 14
                                                  //| , 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30)
  v2.to(30,5)                                     //> res17: scala.collection.immutable.Range.Inclusive = Range(10, 15, 20, 25, 30
                                                  //| )
  
  v2 to 30                                        //> res18: scala.collection.immutable.Range.Inclusive = Range(10, 11, 12, 13, 14
                                                  //| , 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30)
  
  v2 to 30 by 5                                   //> res19: scala.collection.immutable.Range = Range(10, 15, 20, 25, 30)
  
  1 to 10                                         //> res20: scala.collection.immutable.Range.Inclusive = Range(1, 2, 3, 4, 5, 6, 
                                                  //| 7, 8, 9, 10)
  //可以很方便实现类型之间的转换
  v2.toDouble                                     //> res21: Double = 10.0
  v2.toFloat                                      //> res22: Float = 10.0
  v2.toString()                                   //> res23: String = 10
  //用bigint类型实现幂运算，此外 BigInt的数字范围比Long更大
  var v7:BigInt=2                                 //> v7  : BigInt = 2
  v7.pow(10)                                      //> res24: scala.math.BigInt = 1024
  //查看类型的上限范围
  Int.MaxValue                                    //> res25: Int(2147483647) = 2147483647
  Long.MaxValue                                   //> res26: Long(9223372036854775807L) = 9223372036854775807
  
  //三引号，避免转义
  var v8="""ab\c"""                               //> v8  : String = ab\c
}