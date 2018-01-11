package dodo.s01base

class Hello {

  def main(args: Array[String]): Unit = {
    for (i <- 1 to 9) {
      for (j <- i to 9) {
        print(i + " * " + j + " = " + i * j + "    ")
      }
      println()
    }
  }

  /**
   * 正常写法
   */
  def xx1(x: Int, y: Int): Int = {
    return x + y
  }
  /**
   * 省略， 返回值类型
   */
  def xx2(x: Int, y: Int) = {
    x + y
  }
  /**
   * 省略， 返回值类型 
   */
  def xx3(x: Int, y: Int) = x + y
  def yy() ={ " " }

}