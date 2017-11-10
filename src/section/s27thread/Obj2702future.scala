package section.s27thread

import scala.concurrent.Future
//不导入此包下面会有提示错误
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Await
import scala.concurrent.duration.Duration


/**
 * 真正开发， 很少使用
 */
class Obj2702future {
  def main(args: Array[String]): Unit = {
    doF01()
    doF02()
  }

  //非阻塞方式
  def doF01() = {
    //创建了Future对象，scala就把它关联到线程池，然后执行future中的代码
    //返回结果就自动触发了onSuccess事件通过case语句就可以得到返回结果。
    var fu = Future {
      println("开始运行计算")
      Thread.sleep(200)
      100 //返回值
    }
    fu.onSuccess { //成功后通过此事件触发
      case x => println(x)
    }
    Thread.sleep(1000) //主线程等1秒，要大于fu的延迟时
  }

  def doF02() = {
    var fu = Future {
      println("开始运行计算")
      Thread.sleep(200)
      100 //返回值
    }
    //也可以主线程得到返回值，主线程是阻塞的
    val r = Await.result(fu, Duration.Inf) //持久化：永久
    println(r)

  }

}