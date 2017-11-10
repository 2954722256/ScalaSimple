package tea.tea8_13
/**
 * 单例对象
 */

object Demo12 {
  def main(args: Array[String]): Unit = {
    Person_12.sleep();
    val p = new Person_12();
    p.eat();
  }
}