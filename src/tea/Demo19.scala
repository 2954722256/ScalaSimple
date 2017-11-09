
/**
 * 特质
 */

abstract class Person_19{
  def eat(){
    println("人在么么么么么的吃。。。。")
  }
  def say();
}

abstract class Student_19 extends Person_19 {
  def say(): Unit = {
    println("学生在叽叽喳喳的说话。。。。")
  }
  
}

trait codeSkill{
  def code(){
    println("认真啊代码。。。")
  }
  
  def run(){
    println("运行代码。。。")
  }
}

trait cookSkill{
	def cook(){
		println("做一个蛋炒饭。。。。")
	}
}

trait driverSkill{
  def dirve(){
    println("老司机上路。。。。。")
  }
  
  def run(){
    println("时速180飚车。。。。。")
  }
}

class BD_Student_19 extends codeSkill with cookSkill with driverSkill{
  override def run(){
    
  }
}


object Demo19 {
  def main(args: Array[String]): Unit = {
    val s = new BD_Student_19();
    s.cook();
    s.dirve();
  }
}