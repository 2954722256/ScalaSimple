/*
学习scala变长参数的使用
知识点1:scala变长参数等效于java的可变参数，形式是：f1(n:Int*)

知识点2:编程参数类型本质是一个集合类型

知识点3：编程参数应位于函数参数列表的最后

知识点4：scala支持柯里化技术，第一个作用是可以改变函数的调用形式，使其更符合函数式编程的风格
第二个作用使得函数的延迟处理得以实现。
*/
object Demo06 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  def f1(n:Int*)={
  	n.reduceLeft(_+_)
  }                                               //> f1: (n: Int*)Int
  
  f1(2,3,4,5)                                     //> res0: Int = 14
  
  def f2(a:Int,b:Int)={a+b}                       //> f2: (a: Int, b: Int)Int
  
  def f21(a:Int)(b:Int)={a+b}                     //> f21: (a: Int)(b: Int)Int
  
  def f3(a:Int,b:Int,c:Int)={a+b+c}               //> f3: (a: Int, b: Int, c: Int)Int
  
  def f31(a:Int)(b:Int)(c:Int)={a+b+c}            //> f31: (a: Int)(b: Int)(c: Int)Int
  def f32(a:Int,b:Int)(c:Int)={a+b+c}             //> f32: (a: Int, b: Int)(c: Int)Int
  def f33(a:Int)(b:Int,c:Int)={a+b+c}             //> f33: (a: Int)(b: Int, c: Int)Int
  
  f2(2,3)                                         //> res1: Int = 5
  f21(2)(3)                                       //> res2: Int = 5
  
  def f4(a:Int,b:Int,f:(Int,Int)=>Int)={f(a,b)}   //> f4: (a: Int, b: Int, f: (Int, Int) => Int)Int
  
  def f41(a:Int)(b:Int)(f:(Int,Int)=>Int)={f(a,b)}//> f41: (a: Int)(b: Int)(f: (Int, Int) => Int)Int
  def f42(a:Int)(b:Int,f:(Int,Int)=>Int)={f(a,b)} //> f42: (a: Int)(b: Int, f: (Int, Int) => Int)Int
  def f43(a:Int,b:Int)(f:(Int,Int)=>Int)={f(a,b)} //> f43: (a: Int, b: Int)(f: (Int, Int) => Int)Int
  
  f43(2,3)(_+_)                                   //> res3: Int = 5
  
  def f5(a:Int)=(b:Int)=>a+b                      //> f5: (a: Int)Int => Int
  
  var f6=f5(2)                                    //> f6  : Int => Int = <function1>
  //做一些其他事情，然后再出入第二个值，这个思想就是函数的延迟处理思想
  f6(3)                                           //> res4: Int = 5
 
}