package tea
/**
 * 函数用法03 - 函数值
 */
object Demo05 {
  
  def sum(num1:Int,num2:Int,num3:Int):Int={
    num1+num2+num3
  }
  
  def main(args: Array[String]): Unit = {
    //普通函数 赋值给常量变量 作为函数值使用
    val mx1 = sum(_,_,_);
    val r1 = mx1(2,3,4)
    println(r1)
    
    val mx2 = sum(2,3,_:Int);
    val r2 = mx2(10)
    println(r2)
    
    //函数直接量 赋值给常量变量 作为函数值使用
    val mx3 = (num1:Int,num2:Int,num3:Int)=>{num1+num2+num3}
    val r3 = mx3(2,3,4)
    println(r3)
    
    val mx4 = mx3(_:Int,5,_:Int)
    val r4 = mx4(10,20);
    println(r4)
  }  
}