package com.wansan.test;
/*
 * �̳��е�����ת�ͺ�����ת��
 * ����ת�ͣ��Զ�ת��,���Ե����������Ѿ���д���ķ���.���������û�е��õ��������ֱ�ӵ��ø������������.���ǻ���ʧ������û�е����෽��
 * (���ǿ���ͨ�������еķ������Դ�������Ķ����ȡ)
 * ����ת��:��Ҫǿ��ת��������ǿת֮����Ҫע��һ��,��������������ǲ��ܹ�ָ�������,��ʹ�ڱ������е�
 * ʱ�򲻻ᱨ��,�����ڵ��÷�����ʱ��ᱨ��java.lang.ClassCastException(����ת������)
 */
public class Test09 extends Test01{
	void fo1(int i) {
		System.out.print(i+1);
	}
	public void add() {
		System.out.print("aaaaa");
	}
	public void eat() {
		System.out.println("bbbb");
	}
	public static void main(String[] args) {
		//����ת��(���ʱ�����ִ���,��Ϊ��������ò���ָ���������)
		//Test01 test012=new Test01();
		//Test09 test09=(Test09) test012;
		//test09.fo1(2);
		//����������ת��������ת�Ϳ��Ե��õ����������ķ���
		Test01 test013=new Test09();
		Test09 test091=(Test09) test013;
		test091.fo1(2);
		test091.add();
	}
}
