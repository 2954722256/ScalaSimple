package section.s7

object Obj705match {

  def main(args: Array[String]): Unit = {
    do01()
  }

  def do01() = {
    val str = "bbb"
    var result = str match {
      case "aaa" => "aaaR"
      case "bbb" => "bbbR"
      case "ccc" => "cccR"
      case "ddd" => "dddR"
    }
    
    println(result)
  }
}