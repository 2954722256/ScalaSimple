
/**
 * 函数用法02 - 本地函数
 */

class Person_04{
  def eat(food:String){
    def cook(food:String):String = {
      def qiedun(food:String):String = {
        "切好的"+food
      }
      val food1 = qiedun(food)
      "做熟的" + food1 
    }
    val foodx = cook(food)
    println("人在么么么么么的吃"+foodx)
  }  
}

object Demo04 {
  def main(args: Array[String]): Unit = {
    val p = new Person_04();
    p.eat("涮羊肉")
  }
}