package section.s8

/**
 *
 */
object Obj901gaojie {
  def main(args: Array[String]): Unit = {
    addAndPrint(2, 3, p2);

    addAndPrint(2, 3, p1);

    val zz = (x: Int) => x + 1
    def zz2: (Int) => Unit = {
      x => println(x)
    }
    def fxx():((String) => Unit) = {
      x => println(x)
    }
//    
//    def fxx2(x:String):Unit={
//      println(x)
//    }
    
    fxx()
    
//    zz2 (2)
  }

  def addAndPrint(x: Int, y: Int, z: (Int) => Unit) = {
    val sum = x + y
    z(sum)
  }

  def p1(num: Int) {
    println("哈哈哈我是p1~~" + num)
  }
  def p2(num: Int) {
    println("呵呵呵我是p2~~" + num)
  }

}