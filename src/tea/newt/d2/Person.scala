

class Person {
  
  //定义在类内部的函数，称为成员函数
  //比如eat()和say()方法就是成员函数
  def eat(){
    println("吃")
    
    //cook()就是本地函数，因为这个方法内嵌在eat()函数里的
    def cook(){println("烹饪")}
    
  }
  
  def say(){println("说")}
}