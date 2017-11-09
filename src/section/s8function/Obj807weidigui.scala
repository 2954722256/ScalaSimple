package section.s8function
/**
 * 如果在递归时，保证函数体的最后一行为调用自己的代码 
 * 	则称这样的递归为尾递归 
 * 	scala会优化它 来大大提高其性能。
 * 		（一般的递归，会调用同一个方法， 重复执行， 效率会比较低 ）
 * 
 * 【自己没有发现区别】
 */
object Obj807weidigui {
  def main(args: Array[String]): Unit = {
//    doF01();
    doF02();
  }
  
  /**
   * 不是尾递归 
   */
  def doF01() = {
    var numMax = 100000
    var numHalfMax = numMax/2
    
    //  不是尾递归  （先打印，再递归）
    //---案例：计算0到100之间偶数的和 值大于50则结束
    val begin = System.currentTimeMillis()
    def fx(x:Int,sum:Int):Int = {
			if(sum>numHalfMax)sum
			else if(x>=numMax)sum
			else if(x % 2 ==0){
			  val result = fx(x+1,sum)
			  println("呵呵呵 这是偶数")
			  result
			  
//			  println("呵呵呵 这是偶数")
//			  fx(x+1,sum)
			}
			else {
			 val result = fx(x+1,sum+x)
			 println("嘻嘻嘻 这是奇数")
			 result
			  
//			  println("嘻嘻嘻 这是奇数")
//			  fx(x+1,sum+x)
			}
		}
		fx(0,0)
		val end = System.currentTimeMillis()
		println(end - begin)
  }
  
  /**
   * 尾递归
   */
  def doF02() = {
    var numMax = 100000
    var numHalfMax = numMax/2
    //尾递归
    //---案例：计算0到100之间偶数的和 值大于50则结束
    val begin = System.currentTimeMillis()
    def fx(x:Int,sum:Int):Int = {
			if(sum>numHalfMax)sum
			else if(x>=numMax)sum
			else if(x % 2 ==0){
//			  val result = fx(x+1,sum)
//			  println("呵呵呵 这是偶数")
//			  result
			  println("呵呵呵 这是偶数")
			  val result = fx(x+1,sum)
			  result
			}
			else {
//			 val result = fx(x+1,sum+x)
//			 println("嘻嘻嘻 这是奇数")
//			 result
			  println("嘻嘻嘻 这是奇数")
			  val result =fx(x+1,sum+x)
			  result
			}
		}
		fx(0,0)
		val end = System.currentTimeMillis()
		println(end - begin)
  }
}