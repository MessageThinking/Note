package com.mainshi; 
/** 
* @author ���ߣ�wanwei 
* @version ����ʱ�䣺2017��11��1�� ����11:18:42 
* ��˵�� 
* ==�Ƚϵ��ǵ�ַ,equals�Ƚϵ�������
* ��ֱ�Ӷ����ַ���������ʱ��,��ͬ���ַ��������ǵ�ַ��һ����
* ����newһ��String�����͵�ʱ��Ƚϵ�ʱ��,ÿ��new����һ���µ�
* ��ַ�����Ǹ�ʱ��Ƚϵ�ʱ���ַ����ĵ�ַ�ǲ�һ����.
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
