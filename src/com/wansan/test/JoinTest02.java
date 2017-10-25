package com.wansan.test;
/*
 * ��Ҫ��join��ʱ��
 */
public class JoinTest02 extends Thread{
 private String name;
 public JoinTest02(String name) {
	 this.name=name;
 }
 public void run() {
	 System.out.println(Thread.currentThread().getName()+"�߳̿�ʼ");
	 for(int i=0;i<5;i++) {
		 System.out.println("�߳�"+name+i);
	 }
	 try {
		sleep((int)Math.random()*10);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 System.out.print("�߳̽���");
 }
 public static void main(String[] args) {
	System.out.println(Thread.currentThread().getName()+"���߳̿�ʼ");
	JoinTest02 joinTest02=new JoinTest02("A");
	JoinTest02 joinTest03=new JoinTest02("B");
	joinTest02.start();
	joinTest03.start();
	try {
		joinTest03.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
		joinTest02.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println(Thread.currentThread().getName()+"���߳̽���");
}
}
