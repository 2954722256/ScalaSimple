package section.s8function.p3

/**
 *	高阶函数？？
 * 		将一个函数直接量用作方法的参数
 * 
 * 		函数在scala中是头等公民，这体现在函数可以被任意的赋值给变量/常量 
 * 		甚至可以当作另一个方法的实参被传递给另一个方法使用 或当作方法的返回值被返回出来
 *
 */
object Obj8034higher {
  def main(args: Array[String]): Unit = {
  }

  /**
   *
   * 将一个函数直接量用作方法的参数
   */
  def doF01() = {
    var arr: Array[String] = Array("aaa", "bbb", "ccc");
    arr.foreach((x: String) => println(x));
  }

  /**
   * 将一个函数直接量用作方法的返回值
   * 
   * 		这里 fxx ： 后面
   * 			(String) => Unit
   * 			表示 ， 传入的删除 => 对应的返回值		(Unit 就是 void)
   */
  def doF02() = {
    def fxx: (String) => Unit = {
      x => println(x)
    }
    
    val list = List("aaa", "bbb", "ccc");
    //等价 
    //list.foreach(fxx(list));
    list.foreach(fxx(_));
  }

}