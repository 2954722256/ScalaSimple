package section.s8function.p3
/**
 * 函数值 - 匿名函数
 *
 * 	scala中函数没什么可特别的 和别的直接量一样可以到处使用
 * 	将函数直接量赋值给一个常量/变量 得到就是一个函数值
 */
object Obj8033value {
  def main(args: Array[String]): Unit = {
    methodValue01()
    methodValue02()
  }

  def methodValue01() = {
    //  将函数赋值给一个变量m
    var m = (x: Int, y: Int) => x * y;

    //  调用m方法， 得到 num 常量
    val num = m(3, 2);
    println(num)
  }

  
  /**
   * var m  指向一个函数
   * 		m 引用还可以修改， 指向另一个函数
   */
  def methodValue02() = {
    var m = (x: Int, y: Int) => x * y;
    val num = m(3, 2);
    println(num)
    m = (x: Int, y: Int) => x + y;
    val num2 = m(3, 2);
    println(num2)
  }

}