package com.wansan.test; 
/** 
* @author 作者：wanwei 
* @version 创建时间：2017年10月17日 上午8:18:19 
* 静态方法和静态代码块的执行顺序 
* 代码中的静态代码块在初始化的时候就会执行
*/
public class Test010 {
 private String name ;
 static {
	 System.out.print("ssadsa");
 }
 public static String getAdd() {
	 System.out.println("sdaaw");
	return "s";
 }
 public static void main(String[] args) {
	Test010 test010=new Test010();
	getAdd();
	
}
}
