package section.s8function

import scala.io.Source
/**
 * 本地函数 -- 函数内嵌的函数称为本地函数
 * 		这样的函数 只能在外部函数内部使用
 * 		外界无法访问
 * 		感觉像，内部类
 */
object Obj8032local {
  def main(args: Array[String]): Unit = {
    val results = getSomeLineFromFile("a.txt", 5);
    for (line <- results) println(line);
  }

  /**
   * 这里和 8031 是一样的， 只是 isOk这个方法只在这里使用
   * 		可以写在方法内部 【本地方法】
   * 	方法直接调用内部方法即可
   */
  def getSomeLineFromFile(fpath: String, needLen: Int) = {
    def isOk(line: String, needLen: Int): Boolean = {
      line.length > needLen
    }

    val lines = Source.fromFile(fpath).getLines();
    for (line <- lines if isOk(line, needLen)) yield line;
  }


}