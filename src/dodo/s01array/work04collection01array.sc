package dodo.s01base

object work04collection {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

	//	定长
	// [类型](长度)
	var v1 = new Array[Int](3)                //> v1  : Array[Int] = Array(0, 0, 0)
	
	var v2 = Array(1,2,3,4)                   //> v2  : Array[Int] = Array(1, 2, 3, 4)

	//	变长
	var v3 = scala.collection.mutable.ArrayBuffer[Int](3)
                                                  //> v3  : scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(3)
	
	import scala.collection.mutable.ArrayBuffer
	var v4 = ArrayBuffer(1,2,3,4)             //> v4  : scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(1, 2, 3, 4)

	
	//	赋值
	v1(0) = 1
	v1(1)	= 2
	
	//直接赋值，可能越界， 最好用append() 方法赋值
	for(i <- 1 to 10){
		v3.append(i)
	}
	
	//	concat方法：
	//	Array需要 定长的
	Array.concat(v2, v1)                      //> res0: Array[Int] = Array(1, 2, 3, 4, 1, 2, 0)
	//	ArrayBuffer可以是不定长的
	ArrayBuffer.concat(v3,v4)                 //> res1: scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(3, 1, 2, 3, 4,
                                                  //|  5, 6, 7, 8, 9, 10, 1, 2, 3, 4)
	
	//用 Array的range构建数组
	var v6 = Array(10,11,12,13,14,15,16,17,18,19);
                                                  //> v6  : Array[Int] = Array(10, 11, 12, 13, 14, 15, 16, 17, 18, 19)
	val v61 = Array.range(10, 20)             //> v61  : Array[Int] = Array(10, 11, 12, 13, 14, 15, 16, 17, 18, 19)
	val v62 = Array.range(10, 20, 2)          //> v62  : Array[Int] = Array(10, 12, 14, 16, 18)
	
	
	// iterate 迭代
	Array.iterate(1,10)(x=>x+1)               //> res2: Array[Int] = Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
	
	Array.iterate(1,10)(x=>x*2)               //> res3: Array[Int] = Array(1, 2, 4, 8, 16, 32, 64, 128, 256, 512)
	Array.iterate(1,10)(_*2)                  //> res4: Array[Int] = Array(1, 2, 4, 8, 16, 32, 64, 128, 256, 512)

	//	tabulate 定长		(和iterate差不多, 只是从 0开始)
	val val9 = Array.tabulate(5)(x=>x+1)      //> val9  : Array[Int] = Array(1, 2, 3, 4, 5)
	val val91 = Array.tabulate(5)(_+1)        //> val91  : Array[Int] = Array(1, 2, 3, 4, 5)
	
	
}