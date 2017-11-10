package tea.tea8_13
/**
 * 抽象类
 * 继承 
 * 多态
 * final
 */

//抽象类
abstract class Person_18{
  def eat(){
    print("人在吭哧吭哧的吃。。。。")
  }
  def say();
}

//继承
class Teacher_18(name:String,addr:String) extends Person_18 {
  def say(): Unit = {
    println("老师在哈哈哈的说话。。。")
  }
}

//继承 - 调用父类构造
class Java_Teacher_18 extends Teacher_18("苍老师","大钟寺"){
  
}

//继承 - 调用父类构造 传入动态参数
//final 的用法
final class BD_Teacher_18(name:String,addr:String) extends Teacher_18(name,addr){
   override final def eat(){
     println("大口大口的吭哧吭哧的吃。。。")
   }
}


object Demo18 {
  def main(args: Array[String]): Unit = {
    //多态
    val p:Person_18 = new BD_Teacher_18("朴老师","亦庄");
    p.eat();
  }
}