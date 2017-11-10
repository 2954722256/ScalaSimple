package section.s8

object Obj902kelihua {
  def main(args: Array[String]): Unit = {
    doF01()
  }

  /**
   * 1.柯里化
   * 		可以自定义结构（都是一样的， 只是结构可以自己定义）
   */ 
  def doF01() = {
    //2个Int参数， 一个函数参数
    def addAndPrint1(n1:Int,n2:Int,pfunc:(Int)=>Unit){
      val sum = n1 + n2
      pfunc(sum)
    }
    //2个Int参数， 单独 一个函数参数
    def addAndPrint2(n1:Int,n2:Int)(pfunc:(Int)=>Unit){
    	val sum = n1 + n2
			pfunc(sum)
    }
    //1个Int参数，1个Int参数， 单独 一个函数参数
    def addAndPrint3(n1:Int)(n2:Int)(pfunc:(Int)=>Unit){
    	val sum = n1 + n2
			pfunc(sum)
    }
    
    //自定义控制结构
    //函数参数， 可以传入一个方法，  _ 占位符
    addAndPrint1(2,3,println(_))
    addAndPrint1(2,3,println)
    
    addAndPrint2(2, 3){
      println(_)
    }
    addAndPrint2(2, 3){
      println
    }
    
    addAndPrint3(2)(3)(println(_))
    addAndPrint3(2)(3)(println)
    
    val l1 = List(1,3,5,7,9)
    l1.foreach(print(_))
  }

}