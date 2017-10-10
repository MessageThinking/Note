package com.wansan.test;
/*
 * java初始化顺序
 * 1.初始化静态代码块
 * 2.需要初始化父类的Object
 * 3.对成员变量进行初始化就是说会将其变成0或者null
 */
public class Test04 extends Test02{
	public String i;
  static {
	  System.out.print("abds");
  }
  public Test04(){
	  System.out.print("sssdd"+i);
  }
  public static void main(String[] args) {
	  Test04 test=new Test04();
	  //Test02 test02=new Test02();
     //  Test04 test04=(Test04) test02;

}
}
