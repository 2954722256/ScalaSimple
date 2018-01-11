package tea.tea8_13

/**
 * 柯里化 高阶函数 自定义控制结构
 */
object Demo10 {
  def main(args: Array[String]): Unit = {
    //1.柯里化
    def addAndPrint1(n1:Int,n2:Int,pfunc:(Int)=>Unit){
      val sum = n1 + n2
      pfunc(sum)
    }
    
    def addAndPrint2(n1:Int,n2:Int)(pfunc:(Int)=>Unit){
    	val sum = n1 + n2
			pfunc(sum)
    }

    def addAndPrint3(n1:Int)(n2:Int)(pfunc:(Int)=>Unit){
    	val sum = n1 + n2
			pfunc(sum)
    }
    
    //2.自定义控制结构
    addAndPrint2(2, 3){
      def doF2(int : Int):Unit = {
        println(4)
      }
      doF2
    }
    
    val l1 = List(1,3,5,7,9)
    l1.foreach(print(_))
  }  
}