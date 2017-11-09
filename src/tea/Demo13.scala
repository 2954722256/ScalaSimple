/**
 * 类的构造
 */
class Person_13(name:String,age:Int){
  val addr = "bj";
  val namex = name;
  val agex = age;
 
  //辅助构造器
  def this(name:String){
    this(name,18);
  }
  
  //辅助构造器
  def this(){
    this("zhang")
  }
  
  def eat(){
  }  
  def sleep(){
  } 
  
  println("Person_13被构造了。。。"+name+"~"+age)
  
}

object Demo13 {
  def main(args: Array[String]): Unit = {
    val p = new Person_13("zhang",19)
    println(p.namex)
    println(p.agex)
    
    val p2 = new Person_13("zhang")
  }
}