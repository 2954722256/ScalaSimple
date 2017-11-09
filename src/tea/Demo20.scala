
/**
 * 其他
 * 	泛型 lazy option caseclass
 */
object Demo20 {
  def main(args: Array[String]): Unit = {
    //1.泛型
    //val l1 = List[String](1,3,5,"a","b","c");
    
    //2.lazy
    lazy val str = "abc";
    //....一万行代码...
    println(str)
    
    //3.option
    def div(a:Int, b:Int):Option[Int] ={
			if(b==0){
				None
			}else{
				Some(a/b)
			}
		}
    println(div(10,5).getOrElse(0))
    println(div(10,0).getOrElse(0))
    
    //4.样例类 caseclass
    //--自动实现序列化
    //--自动实现方法 - toString equals hashCode
    //--自动带有工厂方法 不用改new关键字就可以构建对象
    case class Person_20(name:String,age:Int){
    }
    
    val p1 = new Person_20("zhang",19);
    val p2 = Person_20("zhang",19);
    
  }
}