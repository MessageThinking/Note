package com.wansan.test;
/*
 * java��ʼ��˳��
 * 1.��ʼ����̬�����
 * 2.��Ҫ��ʼ�������Object
 * 3.�Գ�Ա�������г�ʼ������˵�Ὣ����0����null
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
