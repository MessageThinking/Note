package com.wansan.test;
/*
 * join方法的使用,当线程中主线程需要子线程的支持才能完成任务的时候
 * 下面第一种是不加join方法的
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
		System.out.print(Thread.currentThread().getName()+"线程开始");
		for(int i=0;i<5;i++) {
			System.out.println("线程"+this.name+i);
		}
		try {
			Thread.sleep((int)Math.random()*10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.print(Thread.currentThread().getName()+"线程结束");
	}
   public static void main(String[] args) {
	  System.out.print("主线程开始");
	  new Thread(new JoinTest01("A")).start();
	  new Thread(new JoinTest01("B")).start();
	  System.out.print("主线程结束");
}
}
