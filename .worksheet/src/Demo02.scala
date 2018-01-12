/*
学习scala的操作符的使用
知识点1：scala中的操作优先级同java，此外注意，当以方法的形式去调用操作符时，是以方法调用顺序来决定的
所以建议：不要用方法形式去调用操作符

知识点2:scala中有4个前缀操作操作符，分别是+，-，！,~。
需要注意的是,在使用前缀操作符时，前面需要有空格
scala用unary来避免歧义，所以建议使用这种形式

知识点3:if else 是有返回值的，scala会将方法体{}里的最后一行表达式的值当做返回值返回
知识点4:如果方法体里只有一行表达式，则{}可以省略
知识点5:scala中，一行就是一个表达式，所以可以不加分号
知识点6:scala中，for循环可以加入条件判断
知识点7:scala中支持嵌套的简化使用，如下：for( a<-1 to 9;b<-1 to a)
@@@知道点8:s函数的使用，比如：s"$i is" 会对i进行取值

*/
object Demo02 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(465); 
  println("Welcome to the Scala worksheet");$skip(14); 
  
  var v1=2;System.out.println("""v1  : Int = """ + $show(v1 ));$skip(11); val res$0 = 
  
  2+3*5;System.out.println("""res0: Int = """ + $show(res$0));$skip(14); val res$1 = 
  2.+(3).*(5);System.out.println("""res1: Int = """ + $show(res$1));$skip(16); 
  
  var v2= +2;System.out.println("""v2  : Int = """ + $show(v2 ));$skip(13); 
  var v3= -2;System.out.println("""v3  : Int = """ + $show(v3 ));$skip(16); 
  var v4= !true;System.out.println("""v4  : Boolean = """ + $show(v4 ));$skip(16); 
  var v5= ~0XFF;System.out.println("""v5  : Int = """ + $show(v5 ));$skip(22); 
  
  var v6=2.unary_+;System.out.println("""v6  : Int = """ + $show(v6 ));$skip(19); 
  var v7=2.unary_-;System.out.println("""v7  : Int = """ + $show(v7 ));$skip(22); 
  var v8=true.unary_!;System.out.println("""v8  : Boolean = """ + $show(v8 ));$skip(22); 
  var v9=0XFF.unary_~;System.out.println("""v9  : Int = """ + $show(v9 ));$skip(59); 
  
  var result=if(v1<5){
  	"small"
  }else{
  	"big"
  };System.out.println("""result  : String = """ + $show(result ));$skip(27); val res$2 = 
  if(v1<5)"small"else"big";System.out.println("""res2: String = """ + $show(res$2));$skip(27); 
  
  var v10=List(1,2,3,4);System.out.println("""v10  : List[Int] = """ + $show(v10 ));$skip(14); 
  var index=0;System.out.println("""index  : Int = """ + $show(index ));$skip(69); 
  while(index<v10.length){
  	println(v10(index))
  	index+=1
  
  };$skip(28); 
  for(i<-1 to 10)println(i);$skip(161); 
  //打印99乘法表
  //1*1=1
  //1*2=2 2*2=4
  //1*3=3 2*3=6 3*3=9
  //……
  
  for(a<-1 to 9){
  	for(b<-1 to a){
  		print(b+"*"+a+"="+b*a+"\t")
  	}
  	println()
  };$skip(67); 
  //scala中，for循环可以加入条件判断
  for(i<-1 to 10;if i<5;if i>2)println(i);$skip(133); 
  //scala中支持嵌套的简化使用，如下： a<-1 to 9;b<-1 to a
  for(a<-1 to 9;b<-1 to a;val flag=if(b!=a)"\t"else"\r\n")
  print(s"$b*$a=${b*a}$flag");$skip(43); 
  var v11=Array("apple","banana","orange");System.out.println("""v11  : Array[String] = """ + $show(v11 ));$skip(24); 
  for(i<-v11)println(i);$skip(88); 
  //scala中有个s函数，支持对字符串通过$的形式取值
 	for(i<-0 to v11.length-1){
 	println(s"$i is "+v11(i))}
 	}

}
