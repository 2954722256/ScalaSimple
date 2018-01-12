package dodo.s01base

object work01 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  def countdown(n: Int) = {
    for (i <- 0 to n) {
      print(n - i + " ")
    }
  }                                               //> countdown: (n: Int)Unit

  var v = countdown(10)                           //> 10 9 8 7 6 5 4 3 2 1 0 v  : Unit = ()

  var a1 = Array(1, 2, 3, 4, 5, 6)                //> a1  : Array[Int] = Array(1, 2, 3, 4, 5, 6)
  def exchange(a: Array[Int]) = {

    var a2 = a clone ()

    for (i <- 0 to a1.length - 1 by 2) {
      a2(i) = a(i + 1)
      a2(i + 1) = a(i)
    }
    a2
  }                                               //> exchange: (a: Array[Int])Array[Int]
  def printA(a: Array[Int]) = {
    for (i <- 0 to a.length-1) {
      print(a(i) + " ")
    }
  }                                               //> printA: (a: Array[Int])Unit

  printA(exchange(a1))
  
  
  
}