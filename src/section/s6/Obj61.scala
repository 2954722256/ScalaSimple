package section.s6

/**
 * 操作符
 * 
 * 	操作符 就是 方法
 * 	方法  就是 操作符
 */
object Obj41 {
  def main(args: Array[String]): Unit = {
    
    println("-------")
    //-------  这里 + 其实就是方法， 也就是 2 这个类， 调用的 .+  这个【+】方法
    var str01 = 2+3
    var str02 = 2.+(3)
    println(str01)
    println(str02)
    
    
    println("-------")
    //-------  同样，方法 也可以用 【空格】 ， 类似操作符使用
    var str1 = "abcdef".substring(3)
    var str2 = "abcdef" substring 3    
    println(str1)
    println(str2)
    
    
    println("-------")
    //------- 多个参数， 参数 还是需要用括号    
    var str11 = "abcdef".substring(2,4)
    var str12 = "abcdef" substring (2,4)
    println(str11)
    println(str12)
    
    println("-------")
    //------- 方法 也是有顺序的 ， 和java的计算一致
    var str21 = 2 + 3 * 4
    var str22 = 2 + 3 * 4 + "a"
    println(str21)
    println(str22)
    
    
    
    println("-------")
    //-------
    
    
    //
  }
}