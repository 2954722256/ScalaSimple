package tea
/**
 * 函数用法01 - 成员方法
 */

class Person_03{
  def eat(food:String){
    println("人在么么么么的"+food)
  }  
}

object Demo03 {
  def main(args: Array[String]): Unit = {
    val p = new Person_03();
    p.eat("羊肉串")
  }
}