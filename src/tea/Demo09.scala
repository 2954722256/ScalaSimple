package tea
/**
 * 函数 其他
 * 		重复参数
 * 		尾递归
 */
object Demo09 {
  
  def main(args: Array[String]): Unit = {
    //1.重复参数
//    def sum(nums:Int*):Int = {
//      var result = 0;
//      for(n <- nums){
//        result += n;
//      }
//      result
//    }
//    val result = sum(1,3,5,7,9)
//    println(result)
  
    //2.尾递归
    //---案例：计算0到100之间偶数的和 值大于50则结束
    val begin = System.currentTimeMillis()
    def fx(x:Int,sum:Int):Int = {
			if(sum>500000)sum
			else if(x>=100000)sum
			else if(x % 2 ==0){
//			  val result = fx(x+1,sum)
//			  println("呵呵呵 这是偶数")
//			  result
			  println("呵呵呵 这是偶数")
			  fx(x+1,sum)
			}
			else {
//			 val result = fx(x+1,sum+x)
//			 println("嘻嘻嘻 这是奇数")
//			 result
			  println("嘻嘻嘻 这是奇数")
			  fx(x+1,sum+x)
			}
		}
		fx(0,0)
		val end = System.currentTimeMillis()
		println(end - begin)
  
  }
}