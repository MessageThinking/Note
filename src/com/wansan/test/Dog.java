package com.wansan.test; 
/** 
* @author ���ߣ�wanwei 
* @version ����ʱ�䣺2017��11��5�� ����5:32:44 
* ��˵�� 
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
