package section.s8function

import scala.io.Source
/**
 * 成员函数， 也就是属于一个类的函数
 */
object Obj803member {
  def main(args: Array[String]): Unit = {
    val results = getSomeLineFromFile("a.txt", 10);
    for (line <- results) println(line);
  }
  
  
  /**
   * 有返回值的方法
   * 	返回值类型， 在 : 后面
   */
  def isOk(line: String, needLen: Int): Boolean = {
    line.length > needLen
  }

  /**
   * 没有返回值的方法
   */
  def getSomeLineFromFile(fpath: String, needLen: Int) = {
    val lines = Source.fromFile(fpath).getLines();
    for (line <- lines if isOk(line, needLen)) yield line;
  }

}