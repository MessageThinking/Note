package com.mainshi; 
/** 
* @author 作者：wanwei 
* @version 创建时间：2017年11月1日 上午11:18:42 
* 类说明 
* ==比较的是地址,equals比较的是内容
* 当直接定义字符串常量的时候,相同的字符串常量是地址是一样的
* 当你new一个String的类型的时候比较的时候,每次new都是一个新的
* 地址所以那个时候比较的时候字符串的地址是不一样的.
*/
public class Test {
public static void main(String[] args) {
	String s1="abc";
	String s2="abc";
	if(s1==s2) {
		System.out.println("111");
	}
	if(s1.equals(s2)) {
		System.out.println("222");
	}
}
}
