package com.wansan.test;
/*
 * join������ʹ��,���߳������߳���Ҫ���̵߳�֧�ֲ�����������ʱ��
 * �����һ���ǲ���join������
 */
public class JoinTest01 implements Runnable{
     private String name;
     public  JoinTest01(String name) {
		// TODO Auto-generated constructor stub
    	 this.name=name;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.print(Thread.currentThread().getName()+"�߳̿�ʼ");
		for(int i=0;i<5;i++) {
			System.out.println("�߳�"+this.name+i);
		}
		try {
			Thread.sleep((int)Math.random()*10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.print(Thread.currentThread().getName()+"�߳̽���");
	}
   public static void main(String[] args) {
	  System.out.print("���߳̿�ʼ");
	  new Thread(new JoinTest01("A")).start();
	  new Thread(new JoinTest01("B")).start();
	  System.out.print("���߳̽���");
}
}
