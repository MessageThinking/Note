package com.wansan.test;

import java.util.Collections;
import java.util.Comparator;

/** 
* @author ���ߣ�wanwei 
* @version ����ʱ�䣺2017��11��8�� ����9:31:55 
* comparable  �ӿڣ�
*/
public class ListTest implements Comparator<ListTest>{
 String name;
 int age;
 int score;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public int getScore() {
	return score;
}
public void setScore(int score) {
	this.score = score;
}
public int compareTo(ListTest o) {
	// TODO Auto-generated method stub
	int i=this.getAge()-o.getAge();
	if(i==0) {
	return	this.getScore()-o.getScore();
	}
	return i;
}
public static void main(String[] args) {
	//listע�����,������list
	Collections.sort(list);
}
@Override
public int compare(ListTest o1, ListTest o2) {
	// TODO Auto-generated method stub
	return 0;
}
}
