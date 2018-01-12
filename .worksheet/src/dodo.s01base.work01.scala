package dodo.s01base

object work01 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(82); 
  println("Welcome to the Scala worksheet");$skip(89); 

  def countdown(n: Int) = {
    for (i <- 0 to n) {
      print(n - i + " ")
    }
  };System.out.println("""countdown: (n: Int)Unit""");$skip(26); 

  var v = countdown(10);System.out.println("""v  : Unit = """ + $show(v ));$skip(37); 

  var a1 = Array(1, 2, 3, 4, 5, 6);System.out.println("""a1  : Array[Int] = """ + $show(a1 ));$skip(166); 
  def exchange(a: Array[Int]) = {

    var a2 = a clone ()

    for (i <- 0 to a1.length - 1 by 2) {
      a2(i) = a(i + 1)
      a2(i + 1) = a(i)
    }
    a2
  };System.out.println("""exchange: (a: Array[Int])Array[Int]""");$skip(99); 
  def printA(a: Array[Int]) = {
    for (i <- 0 to a.length-1) {
      print(a(i) + " ")
    }
  };System.out.println("""printA: (a: Array[Int])Unit""");$skip(25); 

  printA(exchange(a1))}
  
  
  
}
