/*
学习scala的操作符的使用
知识点1：scala中的操作优先级同java，此外注意，当以方法的形式去调用操作符时，是以方法调用顺序来决定的
所以建议：不要用方法形式去调用操作符

知识点2:scala中有4个前缀操作操作符，分别是+，-，！,~。
需要注意的是,在使用前缀操作符时，前面需要有空格
scala用unary来避免歧义，所以建议使用这种形式

知识点3:if else 是有返回值的，scala会将方法体{}里的最后一行表达式的值当做返回值返回
知识点4:如果方法体里只有一行表达式，则{}可以省略
知识点5:scala中，一行就是一个表达式，所以可以不加分号
知识点6:scala中，for循环可以加入条件判断
知识点7:scala中支持嵌套的简化使用，如下：for( a<-1 to 9;b<-1 to a)
知道点8:s函数的使用，比如：s"$i is" 会对i进行取值

*/
object Demo02 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  var v1=2                                        //> v1  : Int = 2
  
  2+3*5                                           //> res0: Int = 17
  2.+(3).*(5)                                     //> res1: Int = 25
  
  var v2= +2                                      //> v2  : Int = 2
  var v3= -2                                      //> v3  : Int = -2
  var v4= !true                                   //> v4  : Boolean = false
  var v5= ~0XFF                                   //> v5  : Int = -256
  
  var v6=2.unary_+                                //> v6  : Int = 2
  var v7=2.unary_-                                //> v7  : Int = -2
  var v8=true.unary_!                             //> v8  : Boolean = false
  var v9=0XFF.unary_~                             //> v9  : Int = -256
  
  var result=if(v1<5){
  	"small"
  }else{
  	"big"
  }                                               //> result  : String = small
  if(v1<5)"small"else"big"                        //> res2: String = small
  
  var v10=List(1,2,3,4)                           //> v10  : List[Int] = List(1, 2, 3, 4)
  var index=0                                     //> index  : Int = 0
  while(index<v10.length){
  	println(v10(index))
  	index+=1
  
  }                                               //> 1
                                                  //| 2
                                                  //| 3
                                                  //| 4
  for(i<-1 to 10)println(i)                       //> 1
                                                  //| 2
                                                  //| 3
                                                  //| 4
                                                  //| 5
                                                  //| 6
                                                  //| 7
                                                  //| 8
                                                  //| 9
                                                  //| 10
  //打印99乘法表
  //1*1=1
  //1*2=2 2*2=4
  //1*3=3 2*3=6 3*3=9
  //……
  
  for(a<-1 to 9){
  	for(b<-1 to a){
  		print(b+"*"+a+"="+b*a+"\t")
  	}
  	println()
  }                                               //> 1*1=1	
                                                  //| 1*2=2	2*2=4	
                                                  //| 1*3=3	2*3=6	3*3=9	
                                                  //| 1*4=4	2*4=8	3*4=12	4*4=16	
                                                  //| 1*5=5	2*5=10	3*5=15	4*5=20	5*5=25	
                                                  //| 1*6=6	2*6=12	3*6=18	4*6=24	5*6=30	6*6=36	
                                                  //| 1*7=7	2*7=14	3*7=21	4*7=28	5*7=35	6*7=42	7*7=49	
                                                  //| 1*8=8	2*8=16	3*8=24	4*8=32	5*8=40	6*8=48	7*8=56	8*8=64	
                                                  //| 1*9=9	2*9=18	3*9=27	4*9=36	5*9=45	6*9=54	7*9=63	8*9=72	9*9=81	
                                                  //| 
  //scala中，for循环可以加入条件判断
  for(i<-1 to 10;if i<5;if i>2)println(i)         //> 3
                                                  //| 4
  //scala中支持嵌套的简化使用，如下： a<-1 to 9;b<-1 to a
  for(a<-1 to 9;b<-1 to a;val flag=if(b!=a)"\t"else"\r\n")
  print(s"$b*$a=${b*a}$flag")                     //> 1*1=1
                                                  //| 1*2=2	2*2=4
                                                  //| 1*3=3	2*3=6	3*3=9
                                                  //| 1*4=4	2*4=8	3*4=12	4*4=16
                                                  //| 1*5=5	2*5=10	3*5=15	4*5=20	5*5=25
                                                  //| 1*6=6	2*6=12	3*6=18	4*6=24	5*6=30	6*6=36
                                                  //| 1*7=7	2*7=14	3*7=21	4*7=28	5*7=35	6*7=42	7*7=49
                                                  //| 1*8=8	2*8=16	3*8=24	4*8=32	5*8=40	6*8=48	7*8=56	8*8=64
                                                  //| 1*9=9	2*9=18	3*9=27	4*9=36	5*9=45	6*9=54	7*9=63	8*9=72	9*9=81
  var v11=Array("apple","banana","orange")        //> v11  : Array[String] = Array(apple, banana, orange)
  for(i<-v11)println(i)                           //> apple
                                                  //| banana
                                                  //| orange
  //scala中有个s函数，支持对字符串通过$的形式取值
 	for(i<-0 to v11.length-1){
 	println(s"$i is "+v11(i))                 //> 0 is apple
                                                  //| 1 is banana
                                                  //| 2 is orange
 	}

}