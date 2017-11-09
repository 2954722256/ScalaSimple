
/**
 * 柯里化
 */
object Demo11 {
  def mx(str:String){
    print(str)
  }
  def mx2(str1:String)(str2:String){
     print(str1 + str2)
  }
  
  def mx3(str1:String,str2:String)(pFunc:(String)=>Unit){
    val str = str1 + str2;
    pFunc(str)
  }
  def main(args: Array[String]): Unit = {
    mx("abc")
    mx{"abc"}
    
    mx2("abc")("xyz")
    mx2{"abc"}{"xyz"}
    
    mx3("abc","xyz"){
      println(_)      
    }
  }
}