package com.wansan.test;
/*
 * 多线程有三种手段一个继承Thread类，另一个是实现Runable接口
 * 注意start不能重复使用,重复使用会报异常。
 * 一个进程有多个线程,进程是资源分配的最小单位,线程是CPU分配的最小单位。
 * yield是一种退让模式,就是说当前有和调用此方法的线程相同等级的线程时
 * 此方法会让方法先让出CPU的权限,等这个线程运行完再运行,这个时间要看归让后的线程
 * 运行多久。sleep可以让低优先级的线程先运行,调用sleep方法的线程是进入了等待状态
 * 不是可运行状态。在sleep时间内的线程肯定不会被启用。
 */
public class ThreadTest01 extends Thread{
    private String name;
    public ThreadTest01(String name) {
    	this.name=name;
    }
    public void run() {
    	for(int i=0;i<5;i++) {
    		System.out.println("名称"+name+i);
    	}
    	try {
			sleep((int)Math.random()*10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    public static void main(String[] args) {
    	ThreadTest01 thread1=new ThreadTest01("A");
    	ThreadTest01 thread2=new ThreadTest01("B");
    	thread1.start();
    	thread2.start();
    }
}

