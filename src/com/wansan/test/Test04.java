package com.wansan.test;
/*
 * java��ʼ��˳��
 * 1.��ʼ����̬�����
 * 2.��Ҫ��ʼ�������Object
 * 3.�Գ�Ա�������г�ʼ������˵�Ὣ����0����null
 * java����ļ���˳��
 * 1.���ؾ�̬�����;�̬�����
 * 2.����������̳и����ʱ����Ҫ���ȶԸ�����м���,���ʱ����
 * ��Ҫ���и�����޲ι�������,������������޲ι�����вι���,���
 * ʱ����Ҫ�������м�һ���вι�����������Ҫ��super������.
 * static�ؼ��֣�static��������û��this�ķ�������static�����ڲ����ܵ��÷Ǿ�̬����,
 * �������ǿ��Ե�.���ҿ�����û�д����κζ����ǰ����,����ͨ���౾��������static����.
 * ��ʵ��������static��������Ҫ��;
 * final:final�಻�ܼ̳�,final�������ܱ�����д(��ˬ,ֻ�ǵ����˺ö�)
 */
public class Test04 extends Test02{
	//����д��ֱ�Ӵ�ӡ������������
	private Test01 test0123=new Test01();
	public String i;
	public String geti() {
		this.i=i;
		return i;
	}
  public Test01 getTest0123() {
		return test0123;
	}
	public void setTest0123(Test01 test0123) {
		this.test0123 = test0123;
	}
static {
	  System.out.print("abds");
  }
  public Test04(){
	  System.out.print("sssdd"+i);
	  
  }
  public static void main(String[] args) {
	  Test04 test=new Test04();
	  System.out.println( test.geti()+test.getTest0123());
	  //Test02 test02=new Test02();
     //  Test04 test04=(Test04) test02;

}
  
  
}
