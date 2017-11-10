package section.s14array

object Obj1401array {
  def main(args: Array[String]): Unit = {
    doF02()
  }
  
  var arr2 = Array("aaa", "bbb", "ccc")
  
  //定义数组
  def doF01() = {
    var z1:Array[String] = new Array[String](3)
		var z2 = new Array[String](3)
		var z3 = Array("aaa", "bbb", "ccc")
  }
  
  //获取数组内容
  def doF02() = {
    println(arr2(2))
  }
  
  //遍历数组
  def doF03() = {
    for(x <- arr2){
			print(x);
		}

		for(x <- 0 to arr2.length -1){
			print(arr2(x));
		}
  }
  //修改数组
  def doF04() = {
    arr2(2) = "z"
    
  }
  
  //其他方法
  def doF05(){
    val arr3 = Array(1,3,5,7,9)
    val arr4 = Array(2,4,6,7,10)
    
    //查询api，  看 Array.concat   [联系， 放一起] def concat[T]( xss: Array[T]* ): Array[T]
		//连接所有阵列成一个数组。
    val arr5 = Array.concat(arr3, arr4)
    arr5.foreach{println}
    
    //def copy( src: AnyRef, srcPos: Int, dest: AnyRef, destPos: Int, length: Int ): Unit
		//复制一个数组到另一个。相当于Java的System.arraycopy(src, srcPos, dest, destPos, length).
//    val arr6 = Array.
    
    
    //def iterate[T]( start: T, len: Int)( f: (T) => T ): Array[T]
		//	返回一个包含一个函数的重复应用到初始值的数组。
		val arr6 = Array();
    
  }
  
}