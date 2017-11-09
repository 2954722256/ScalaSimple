
/**
 * 属性即无参方法 无参方法即属性
 */

class Person_15{
  def say = "你瞅啥？"
  val say2 = "瞅你咋地？"
}

object Demo15 {
  def main(args: Array[String]): Unit = {
    val p = new Person_15();
    println(p.say)
    println(p.say2)
  }
}