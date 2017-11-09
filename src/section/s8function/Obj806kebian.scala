package section.s8function

import scala.io.Source
/**
 * 重复参数 （可变参数）
 *
 */
object Obj806kebian {
  def main(args: Array[String]): Unit = {
    doF01()
  }

  def doF01() = {
    def sum(nums: Int*): Int = {
      var result = 0;
      for (n <- nums) {
        result += n;
      }
      result
    }
    val result = sum(1, 3, 5, 7, 9)
    println(result)

  }

}