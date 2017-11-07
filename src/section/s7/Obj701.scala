package section.s7

/**
 * 逻辑操作, 可以得到结果， 得到返回值
 * 		逻辑操作的结果， 可以直接赋值给一个变量
 *
 * 最好 不要在有返回值的 逻辑操作中， 做别的操作， 做好是一个整体
 *
 */
object Obj701 {
  def main(args: Array[String]): Unit = {

    //    doIf()
    //    doWhile()
    doFor()

  }

  def doFor() {
    println("-------")
    //------- for 循环
    //    for (x <- 1 to 10) {
    //      print(x)
    //    }

    println("-------")
    //------- List的 for 循环
    val list = List(1, 3, 5, 7, 9);
    //一般的方式
    for (x <- 0 to list.size - 1) {
      println(list(x))
    }
    println("----for each的方式---")
    // for each的方式
    for (x <- list) {
      println(x)
    }

    println("-------")
    //    //------- 本来的for中的判断，  可以用过滤解决  （也就是， for参数中，添加判断， 赋值 等操作）
    for (x <- 1 to 10) {
      if (x % 2 == 0) {
        print(x)
      }
    }
    println("-------")
    val r = 0 to 10;
    for (x <- r if x % 2 == 0) println(x)
    println("-------")
    for (x <- 0 to 10 if x % 2 == 0) println(x)

  }

  /**
   * 最好不要使用 while，   do。。while
   * 	最好用   递归   去替代
   */
  def doWhile() {
    var sum = 0
    var x = 1
    //    val result = while(x<=10){
    //      sum += x
    //      x += 1
    //    }    
    //    println(result)
    //    println(sum)

    //    val result = mx2(x,sum)
    val result = mx(1, 0)
    print(result)

  }

  /**
   * 函式方法， 可以得到返回值
   * 递归方法
   * 	可以省略 很多符号
   * 			;		{}		return		等等，都可以省略
   */
  def mx(x: Int, sum: Int): Int = {
    if (x <= 10) mx(x + 1, sum + x)
    else sum
  }

  /**
   * 直接的方法， 没有返回值
   */
  def mx2(x: Int, sum: Int) {
    if (x <= 10) mx(x + 1, sum + x)
    else sum
  }

  /**
   * if判断， 可以有返回值
   */
  def doIf() {
    var num = 19;
    var result = if (num < 10) {
      //      println("<<<<")
      "小于10"
    } else {
      //      println(">>>>")
      "大于10"
    }
    println(result)
  }

}