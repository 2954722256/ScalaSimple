/*
学习匿名函数的声明及使用
知识点1:匿名函数可以直观理解为：没有函数名的函数，形式是：(a:Int,b:Int)=>{a+b}

知识点2:如果匿名的函数参数的类型可以推断出来，则类型的声明可以省略，比如：

v1.reduceLeft((a:Int,b:Int)=>a+b) 化简成：v1.reduceLeft((a,b)=>a+b)
知识点3:scala中的函数可以赋值给其他的变量或常量，形式是：var f3=f1(_,_)
注意：用_占位符。如果是：var f2=f1(2,3) ，则是把f1函数的结果赋值给f2了

知识点4：可以通过匿名函数来概念函数的方法体内容

*/
object Demo03 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  def f1(a:Int,b:Int)={a+b}                       //> f1: (a: Int, b: Int)Int
  
  (a:Int,b:Int)=>a+b                              //> res0: (Int, Int) => Int = <function2>
  (a:Int,b:Int)=>{a+b}                            //> res1: (Int, Int) => Int = <function2>
  
   (a:Int)=>a+1;                                  //> res2: Int => Int = <function1>
   //(a,b)=>a+b
   var v1=Array(1,2,3,4)                          //> v1  : Array[Int] = Array(1, 2, 3, 4)
   v1.reduceLeft((a,b)=>a+b)                      //> res3: Int = 10
   
   var f2=f1(2,3)                                 //> f2  : Int = 5
   var f3=f1(_,_)                                 //> f3  : (Int, Int) => Int = <function2>
   f3=(a:Int,b:Int)=>{a*b}
   f3(2,3)                                        //> res4: Int = 6
}