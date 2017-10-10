package com.wansan.test;
/*
 * yield就是将线程的运行状态转变成可运行状态,就是暂停当前运行的线程,让其等待。
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
		//当到底30的时候先等待此线程先等待，然后让线程进行
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
