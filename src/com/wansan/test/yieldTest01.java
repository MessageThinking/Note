package com.wansan.test;
/*
 * yield���ǽ��̵߳�����״̬ת��ɿ�����״̬,������ͣ��ǰ���е��߳�,����ȴ���
 */
public class yieldTest01 extends Thread{
 private String name;
 public yieldTest01(String name) {
	this.name=name;
 }
 @Override
	public void run() {
	for(int i=0;i<50;i++) {
		System.out.println(this.getName()+i);
		//������30��ʱ���ȵȴ����߳��ȵȴ���Ȼ�����߳̽���
		if(i==30) {
			this.yield();
		}
	}
	
	}
 public static void main(String[] args) {
	yieldTest01 yieldtest01=new yieldTest01("A");
	yieldTest01 yieldtest02=new yieldTest01("B");
	yieldtest01.start();
	yieldtest02.start();

}
}
