package tea.newt.d1var

object Obj01Var {

  def main(args: Array[String]): Unit = {
    var v1 = "hello"
    
    v1.split("l") //> res0: Array[String] = Array(he, "", o)
    v1 * 3 //> res1: String = hellohellohello
    v1.drop(2) //> res2: String = llo
    v1.dropRight(2) //> res3: String = hel
    v1.concat("world") //> res4: String = helloworld
    v1.count { x => x == 'l' } //> res5: Int = 2
    v1.filter { x => x != 'l' } //> res6: String = heo
    v1.exists { x => x == 't' } //> res7: Boolean = false
    
//    v1.foreach { x => x } //> h
//    v1.foreach { x => println(x) } //> h
//    //| e
//    //| l
//    //| l
//    //| o
    v1.max //> res8: Char = o
    v1.min //> res9: Char = e
    v1.head //> res10: Char = h
    v1.last //> res11: Char = o

    v1.mkString(",") //> res12: String = h,e,l,l,o
    v1.reverse //> res13: String = olleh
  }

}