package com.wansan.test; 
/** 
* @author 作者：wanwei 
* @version 创建时间：2017年11月5日 下午5:32:44 
* 类说明 
*/
public class Dog extends Animals {
String name;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAge() {
	return age;
}
public void setAge(String age) {
	this.age = age;
}
String age;
//public void add() {
//	System.out.print("2sdaa");
//}
public static void main(String[] args) {
	Animals animals=new Dog();
	animals.getAges();
	animals.add();
}
}
