package tea.tea8_13
/**
 * 函数的声明 方式1 标准声明方式
 */
object Demo01 {
  //标准声明方式
  def sum1(num1: Int, num2: Int): Int = {
    return num1 + num2;
  }
  //大部分情况下 返回值类型可以自动推断 可以省写
  def sum2(num1: Int, num2: Int) = {
    num1 + num2;
  }
  //如果函数体只有一行 包裹函数体的大括号可以省写
  def sum3(num1: Int, num2: Int) = num1 + num2;

  //如果返回值类型是UNIT,则另一种写法是可以去掉返回值类型和等号 把方法体写在花括号内,而这时方法内无论返回什么 返回值都是 UNIT
  def sumAndPrint1(num1: Int, num2: Int): Unit = {
    println(num1 + num2);
  }
  def sumAndPrint2(num1: Int, num2: Int) {
    println(num1 + num2);
  }
}