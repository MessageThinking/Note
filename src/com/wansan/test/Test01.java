package com.wansan.test;
public class Test01 {
void fo1(int i) {
	System.out.print(i);
}
void fo2(char s) {
	System.out.print(s);
}
void fo3() {
	/*
	 * ��һ���������������char���ͣ�������Ϊ�������ε����ʹ�С
	 * ����ת����int
	 */
	fo1('d');
	fo1(1);
}
public static void main (String [] args) {
	Test01 test01=new Test01();
	test01.fo1('c');
	
}
}

