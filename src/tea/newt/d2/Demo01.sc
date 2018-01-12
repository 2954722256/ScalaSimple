/*
补充for循环的相关是知识点，异常机制，match匹配以及break、continue

知识点1：for……yield称为 for循环推导式，用于将for循环形成的数据形成新的集合类型，
scala中的集合概念很广泛，可以array，list,map,set,range,vector
所以，yield生成的新的集合类型是什么，取决于 循环遍历的数据结构。比如如果遍历的是array,则生成的就是array

知识点2：要掌握如何通过for循环去遍历和操作map，形式是： for((k,v)<-v2){}

知识点3：scala中的异常机制处理，与java不同的地方是catch的捕获，形式是通过case来匹配的，
比如： case t: NullPointerException => t.printStackTrace();("null");
此外，有时需要手动导包，scala编译器不能自动导包

知识点4：match匹配类似于java中的switch，形式是通过case来匹配的，比如：
case "aaa"=>"1"
case "bbb"=>"2"
此外，match是有返回值的，注意，如果是println()这种方法调用，则返回是空（UNIT)。
还有_的使用,称为占位符，在match中，可以用_表示其他条件。

知识点5:scala中的break和continue的实现需要导包，util.control.Breaks._
然后通过breakable来进行控制。
如果要实现break效果，则形式是：breakable(循环体{})
如果要实行continue效果，则形式是：循环体{breakable(代码)}

*/
import java.io.IOException
import util.control.Breaks._

object Demo01 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  for(i<-1 to 5)yield{i*2}                        //> res0: scala.collection.immutable.IndexedSeq[Int] = Vector(2, 4, 6, 8, 10)
  
  var v1=Array(1,2,3,4,5)                         //> v1  : Array[Int] = Array(1, 2, 3, 4, 5)
  
  for(i<-v1)yield{i*2}                            //> res1: Array[Int] = Array(2, 4, 6, 8, 10)
  
  //map的赋值：key->value 这种形式
  var v2=Map("name"->"tom","age"->23)             //> v2  : scala.collection.immutable.Map[String,Any] = Map(name -> tom, age -> 2
                                                  //| 3)
  
  for((k,v)<-v2){
  	println(k+":"+v)                          //> name:tom
                                                  //| age:23
  }
  
  try {
      throw new RuntimeException("error");
    }catch {
      case t: NullPointerException => t.printStackTrace();("null");
      case t: Exception=>{
      t.printStackTrace()
      println("other")
      }
    }finally {
      println("colse")
    }                                             //> java.lang.RuntimeException: error
                                                  //| 	at Demo01$$anonfun$main$1.apply$mcV$sp(Demo01.scala:46)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$$anonfun$$exe
                                                  //| cute$1.apply$mcV$sp(WorksheetSupport.scala:76)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.redirected(W
                                                  //| orksheetSupport.scala:65)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.$execute(Wor
                                                  //| ksheetSupport.scala:75)
                                                  //| 	at Demo01$.main(Demo01.scala:29)
                                                  //| 	at Demo01.main(Demo01.scala)
                                                  //| other
                                                  //| colse
                                                  //| res2: Any = ()
    var v3="bbb"                                  //> v3  : String = bbb
    
    var result=v3 match{
    	case "aaa"=>"1"
    	case "bbb"=>"2"
    	case _=>"3"
    }                                             //> result  : String = 2
    
    breakable(
    for(i<- 1 to 10){
    if(i==8){
     break
    }else{
    println(i)
    }
   		 
 
    }
  )                                               //> 1
                                                  //| 2
                                                  //| 3
                                                  //| 4
                                                  //| 5
                                                  //| 6
                                                  //| 7
     for(i<- 1 to 10){
     	breakable(
     		if(i==8){
     			break
     		}
     		else{
     			println(i)
     		}
     	
     	)                                         //> 1
                                                  //| 2
                                                  //| 3
                                                  //| 4
                                                  //| 5
                                                  //| 6
                                                  //| 7
                                                  //| 9
                                                  //| 10
     	
     }
}