package section.s8function

import scala.io.Source

/**
 * 占位符
 * 		_ 的用法
 *
 * scala中的下划线_是一个神奇的占位符，可以用它当作一个或多个参数来使用
 * 		可以使用下划线_占位符的前提要求是每个参数在函数直接量中仅出现一次，并且按照顺序出现
 * 				满足条件的情况下 可以去掉参数的说明，直接在函数体中使用下划线即可
 * 		使用下划线时，
 * 				如果类型可以自动推断出，则不用声明类型，
 * 				如果无法自动推断类型，则在下划线后自己来显示声明类型即可
 */
object Obj804zwf {
  def main(args: Array[String]): Unit = {
    doF01()
//    doF02()
  }

  def doF01() = {
    val list = List("aaa", "bbb", "ccc");
    
    //定义方法，      =>  指向返回值   （参数类型 => 返回值类型）
    def fxx: (String) => Unit = {
      x => println(x)
    }
//    def fxx22 = {
//      x:Object => println(x)
//    }
    
    list.foreach(fxx(_));    
    println("--------")
    
    //定义方法，  => 指向 方法体   (参数集合  => 方法体)
    def fxx2 = (x:String) => println(x)
    list.foreach(fxx2(_));
    
    println("--------")
    println(list.foreach(println(_)))
    
    
  }

  def doF02() = {
    val listNum = List(2, -2, 4);

    println("-----")
    println(listNum.filter(_ > 0))    
  }
  
  /**
   * _ 直接写方法， 需要添加数据类型 
   */
  def doF03() = {
    val f = (_: Int) + (_: Int)
    //		val f = _ + _;//报错 未知类型
    val value = f(5, 10)
    println("-----")
    println(value)
    
  }
  

}