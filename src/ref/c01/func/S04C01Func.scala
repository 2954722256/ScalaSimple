package ref.c01.func
/**
 * 定义函数
 */
object S04C01Func {
  /**
   * def  funcName():returnTypep = {
   * 		xxxx
   * }
   */
  def printMe(): Unit = {
    println("Hello, Scala!")
  }

  def addInt(a: Int, b: Int): Int = {
    var sum: Int = 0
    sum = a + b
    return sum
  }
}