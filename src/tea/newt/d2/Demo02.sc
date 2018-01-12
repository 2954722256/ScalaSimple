/*
需要函数的声明及调用

知识点1：通过 def 关键字来定义一个函数。形式是： def 函数名 (){方法体}
知识点2：如果想声明函数的返回值类型，可以通过这种形式： def 函数名():返回值类型={方法体}
知识点3：函数会将方法体里的最后一行代码作为返回值返回
知识点4：scala能够根据方法体的返回值自动推断出函数的返回值类型
知识点5：scala自动推断的前提条件是 = 号，注意：如果函数没有=号，则无论方法体返回的是什么类型，都是Unit
知识点6：函数默认的访问权限就是public,不需要显示的指定。
此外，也可以在def前，声明private,protected
知识点7：如果函数的方法体只有一行代码，则{}可以省略
知识点8:scala函数默认参数的使用形式： def f7(a:String,b:String="[",c:String="]")={}
*/
object Demo02 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  def f1(){}                                      //> f1: ()Unit
  
  def f2():Int={2}                                //> f2: ()Int
  
  def f3():String={
  "bbb"
  "aaa"
  }                                               //> f3: ()String
  
  def f4()={2}                                    //> f4: ()Int
  def f5(){2}                                     //> f5: ()Unit
  
  def f6(a:Int,b:Int)=a+b                         //> f6: (a: Int, b: Int)Int
 // def f7(a:String,b:Int)={a*b}
  f6(2,3)                                         //> res0: Int = 5
  
  def f7(a:String,b:String="[",c:String="]")={
  	b+a+c
  }                                               //> f7: (a: String, b: String, c: String)String
  
  f7("hello")                                     //> res1: String = [hello]
  f7("hello","(",")")                             //> res2: String = (hello)
  
}