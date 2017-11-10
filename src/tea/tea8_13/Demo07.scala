package tea.tea8_13
/**
 * 函数用法04 - 高阶函数 - 作为方法的返回值使用
 */
object Demo07 {
  
  def main(args: Array[String]): Unit = {
    val mx1 = lookUpCookBook("羊肉串")
    val foodx = mx1("羊肉串")
    println(foodx)
    
    val  mx2 = lookUpCookBook("麻辣香锅");
    val foodz = mx2("麻辣香锅")
    println(foodz)
  }
  
  def lookUpCookBook(food:String):(String)=>String = {
      if("羊肉串".equals(food)){
        def how2CookYRC(food:String):String = {
          return "烤熟"+food
        }
        how2CookYRC;
      }else if("涮羊肉".equals(food)){
        (food:String)=>{"煮熟"+food}
      }else{
        //(food:String)=>{"做熟"+food}
        //(food:String)=>"做熟"+food
      	//food:String=>"做熟"+food
      	//food => "做熟"+food
        "做熟的"+_
      }
  }
  
}