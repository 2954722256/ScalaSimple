package tea.tea8_13

/**
 * 下划线的用法
 */

object Demo08 {
  def main(args: Array[String]): Unit = {
    //1.下划线在函数直接量中 替代参数列表中的参数
    //--这样做的前提条件是：所有参数都只使用过一次 且严格按照声明顺序来使用
    //--另外，在使用下划线替代参数列表时 如果参数类型可以自动推断 则类型声明可以省略 如果无法推断 则必须附带类型声明
    val sum1 = (a:Int,b:Int,c:Int)=>{a+b+c}
    val sum2 = (_:Int)+(_:Int)+(_:Int)
    sumAndPrint(_+_+_)
    
    def sumAndPrint(sumFunc:(Int,Int,Int)=>Int){
      val sum = sumFunc(2,3,4);
      print(sum)
    }
    
    //2.下划线可以在将函数作为函数值使用时 替代所有或部分参数列表
    def sum3(a:Int,b:Int,c:Int):Int = {
      a+b+c
    }
    val mx1 = sum3(_,_,_);
    val mx2 = sum3(2,(_:Int),5)
  }
}