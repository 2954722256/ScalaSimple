package tea.tea8_13
/**
 * 函数的声明 方式2 函数直接量
 * 
 * 函数直接量方式声明的函数 没有方法名 无法直接调用 本身也不是为了直接调用而设计的
 * 函数直接量方式声明的函数 主要是用在 函数值的用法 本地函数的用法 高阶函数的用法 中
 */
object Demo02 {
  //标准声明方式
  (num1:Int,num2:Int)=>{num1+num2}
  
  //如果函数体只有一行大括号可以省略
  (num1:Int,num2:Int)=>num1+num2
  
  //如果函数的参数类型可以推测得知 则参数类型可以省写
  //这种用法 往往用在高阶函数的用法中
  //(num1,num2)=>num1+num2//此处无法推测类型 报错
  
  //如果函数的参数列表只有一个参数 则在不产生歧义的情况下 包裹参数列表的小括号可以省写
  //这种用法 往往用在高阶函数用法中
  //(num1:Int)=>{num1*100};
  //num1:Int=>{num1*100}//有歧义 报错
  
  
  
}