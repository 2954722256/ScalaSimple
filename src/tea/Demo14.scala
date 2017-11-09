
/**
 * 重写重载
 */

class Person_14{
  def say(){
    println("人在的吧的吧的说。。。。")
  }
  def eat(){
    println("人在biajibiaji的吃饭。。。。")
  }
}

class Teacher_14 extends Person_14{
  //重写
  override def say(){
    println("老师在一本正经的的吧的吧的说。。。")
  }
  
  //重载
  def eat(food:String){
    println("老师在biajibiaji的 吃。。。"+food)
  }
  //重载
  def eat(food:String,wine:String){
	  println("老师在biajibiaji的 吃。。。"+food+"就着"+wine)
  }
  
  
}


object Demo14 {
  
}