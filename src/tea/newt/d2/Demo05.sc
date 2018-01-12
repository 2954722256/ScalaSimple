/*
*用于学习递归的使用
知识点1：scala里有尾递归的概念，指的是分支的返回值的最后一行代码是递归调用，就是尾递归，scala底层会针对尾递归做出优化

知识点2：scala支持懒值的调用，使用形式：lazy val v1=2。
懒值的特点是声明时不赋值，什么时候被调用，什么时候被赋值。
此外，懒值必须是常量(val)
*/
object Demo05 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  //案例① 利用递归实现斐波那契数列
  //1 1 2 3 5 8 13 ……
  //在写递归函数时：
  //首先需要找到结束条件
  //其次找出函数关系
  //注意：scala的递归函数，需要显示的声明函数的返回值类型。不要使用自动推断
  //此外，就是结束条件的返回值 用return 返回
  
  //f(n)=f(n-1)+f(n-2)
  
  def fib(n:Int):Int={
  	if(n==0)return 1
  	if(n==1)return 1
  	else fib(n-1)+fib(n-2)
  }                                               //> fib: (n: Int)Int
  fib(7)                                          //> res0: Int = 21
  
  //案例② 给定一组数列
  //2  3  4  9  16  81
  //f(n)=f(n-2)*f(n-2)
  //基于上面的数列，编写一个递归函数,比如f1(n:Int),求给定的第n项数列的结果
  def f1(n:Int):Int={
  	if(n==0)return 2
  	if(n==1)return 3
  	else f1(n-2)*f1(n-2)
  }                                               //> f1: (n: Int)Int
  
  f1(6)                                           //> res1: Int = 256
  
  //案例③ 给定一组数列
  //2  3  4  9  8  27  16  81
  //如果n是偶数的情况：f(n)=2*f(n-2)
  //如果n是奇数的情况：f(n)=3*f(n-2)
  def f3(n:Int):Int={
  	if(n==0)return 2
  	if(n==1)return 3
  	if(n%2==0)2*f3(n-2)
  	else 3*f3(n-2)
  }                                               //> f3: (n: Int)Int
  f3(8)                                           //> res2: Int = 32
  
  //案例④，通过递归，求1~n的数字之和，比如给定n=10,求1~10的整数之和
  //数字：1 2 3 4 5
  //求和：1 3 6 10 15
  //关系：f(n)=f(n-1)+n
  
  def f4(n:Int):Int={
  	if(n==0) return 0
  	else f4(n-1)+n
  }                                               //> f4: (n: Int)Int
  
  f4(4)                                           //> res3: Int = 10
  f4(5)                                           //> res4: Int = 15
  
  var v1=2                                        //> v1  : Int = 2
  lazy val v2=2                                   //> v2: => Int
}