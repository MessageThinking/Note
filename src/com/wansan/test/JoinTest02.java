package com.wansan.test;
/*
 * 需要加join的时候
 */
public class JoinTest02 extends Thread{
 private String name;
 public JoinTest02(String name) {
	 this.name=name;
 }
 public void run() {
	 System.out.println(Thread.currentThread().getName()+"线程开始");
	 for(int i=0;i<5;i++) {
		 System.out.println("线程"+name+i);
	 }
	 try {
		sleep((int)Math.random()*10);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 System.out.print("线程结束");
 }
 public static void main(String[] args) {
	System.out.println(Thread.currentThread().getName()+"主线程开始");
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
	System.out.println(Thread.currentThread().getName()+"主线程结束");
}
}
