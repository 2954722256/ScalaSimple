/*
学习高阶函数的声明和使用
知识点1：高阶函数是函数式编程的最重要特性，即函数可以当做参数进行传递。所以有一句话：在函数式编程中，函数是一等公民

知识点2：要掌握高阶函数的声明的形式:f1(a:Int,b:Int,f:(Int,Int)=>Int)
调用的时候，传入的是一个匿名函数

知识点3：如果匿名函数的参数列表只有一个，则（）可以省略，形式比如：f3("Hello",a=>a.toLowerCase())

知识点4:匿名函数可以用_的形式来进行化简
*/
object Demo04 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  def f1(a:Int,b:Int,f:(Int,Int)=>Int)={
  f(a,b)
  }                                               //> f1: (a: Int, b: Int, f: (Int, Int) => Int)Int
  
  f1(2,3,(a:Int,b:Int)=>a+b)                      //> res0: Int = 5
  f1(2,3,(a:Int,b:Int)=>a*b)                      //> res1: Int = 6
  
  //定义一个高阶函数f2，接收两个String型的参数，以及一个函数，
  //这个函数的作用是操作两个字符串，并且返回的类型是String
  
  def f2(a:String,b:String,f:(String,String)=>String)={
  	f(a,b)
  }                                               //> f2: (a: String, b: String, f: (String, String) => String)String
  f2("hello","world",(a:String,b:String)=>a.concat(b))
                                                  //> res2: String = helloworld
  f1(2,3,(a,b)=>a+b)                              //> res3: Int = 5
  f2("hello","world",(a,b)=>a.concat(b))          //> res4: String = helloworld
  
  def f3(a:String,f:(String)=>String)={f(a)}      //> f3: (a: String, f: String => String)String
  
  f3("Hello",(a:String)=>a.toLowerCase())         //> res5: String = hello
 	f3("Hello",a=>a.toLowerCase())            //> res6: String = hello
 	
 	f1(2,3,_+_)                               //> res7: Int = 5
 	f1(2,3,_*_)                               //> res8: Int = 6
 	f2("hello","world",_+_)                   //> res9: String = helloworld
 	
 	var v1=Array(1,2,3,4)                     //> v1  : Array[Int] = Array(1, 2, 3, 4)
 	v1 foreach{x=>println(x)}                 //> 1
                                                  //| 2
                                                  //| 3
                                                  //| 4
  v1 foreach{println(_)}                          //> 1
                                                  //| 2
                                                  //| 3
                                                  //| 4
  
  v1 reduceLeft{(a,b)=>a+b}                       //> res10: Int = 10
  v1 reduceLeft{_+_}                              //> res11: Int = 10
  
  
  //课堂练习①.编写一个函数countdown(n:Int)，打印从n到0的数字
  def countdown(n:Int){
  	for(i<-0 to n reverse){
  		println(i)
  	}
  }                                               //> countdown: (n: Int)Unit
  countdown(10)                                   //> 10
                                                  //| 9
                                                  //| 8
                                                  //| 7
                                                  //| 6
                                                  //| 5
                                                  //| 4
                                                  //| 3
                                                  //| 2
                                                  //| 1
                                                  //| 0
  
  //课堂练习② 编写函数，接收一个Array类型的数组，通过一个循环将整数数组中相邻的元素置换，比如：
  //Array(1,2,3,4,5,6)  得到的结果：2 1 4 3 6 5
  def revert(a:Array[Int])={
  	for(i<-0 to a.length-1 by 2){
  		var t=a(i)
  		a(i)=a(i+1)
  		a(i+1)=t
  	}
  }                                               //> revert: (a: Array[Int])Unit
  
  
  
  //利用递归实现斐波那契数列
  //1 1 2 3 5 8 13 ……
  //要求编写递归函数，比如函数 fib(n:Int)
  //调用时，比如调用：
  //fib(0)=1
  //fib(1)=1
  //fib(4)=5
  
}