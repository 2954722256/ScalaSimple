
/**
 * 函数用法04 - 高阶函数 - 作为方法参数使用
 */
object Demo06 {
  def main(args: Array[String]): Unit = {
    def how2CookYRC(food:String):String = {
      return "火上烤，放孜然，要巨辣"+ food;
    }
    
    val foodx = cook("羊肉串",how2CookYRC);
    println(foodx)
  
    val foodz = cook("涮羊肉",(food:String)=>{"清汤锅底 烧开煮熟"+food})
    println(foodz)
  }
  
  def cook(food:String,mx:(String)=>String):String = {
    val foodx = mx(food)
    return foodx;
  }
}