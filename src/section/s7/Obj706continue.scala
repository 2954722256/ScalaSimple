package section.s7

/**
 * scala 没有 continue 关键字
 * 			也没有 break	关键字
 */
object Obj706continue {
  def main(args: Array[String]): Unit = {
    //    doJava()
    //    doScala01()
    doScala02()
  }

  def doScala02() = {
    def fx(x: Int, sum: Int): Int = {
      if (sum > 50) sum
      else if (x >= 100) sum
      else if (x % 2 == 0) fx(x + 1, sum)
      else fx(x + 1, sum + x)
    }
    fx(0, 0)
  }

  /**
   * 可以用变量替代 continue， break
   * 【还是， 不建议使用，  方法内，有变量】
   */
  def doScala01() = {
    var x = 0;
    var sum = 0;
    var sumOver = false;
    while (x < 100 && !sumOver) {
      if (sum > 50) {
        sumOver = true;
      }
      if (x % 2 == 0) {

      } else {
        sum += x;
      }
    }
  }

  /**
   * scala 没有 continue 关键字
   * 			也没有 break	关键字
   */
  def doJava() {
    //    int x = 0;
    //    int sum = 0;
    //    while (x < 100) {
    //      if (sum > 50) {
    //        break;
    //      }
    //      if (x % 2 == 0) {
    //        continue;
    //      } else {
    //        sum += x;
    //      }
    //    }
  }

}