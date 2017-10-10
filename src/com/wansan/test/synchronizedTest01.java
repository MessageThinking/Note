package com.wansan.test;
/*
 * synchronized线程同步：当多个线程在同时使用的时候,很容易发生抢占资源
 * 的情况,所以此时需要用同步来防止阻塞问题。和synchronized一起使用的有
 * wait(),notify()。wait()是让当前线程等待,notify()是让当前线程苏醒实质上
 * 但是这里的等待和苏醒只是将对象锁进行释放和给予,当锁被获取时,此线程可以继续运行
 * 当锁被释放时,线程就停止。当然notify()方法必须还需要在
 */
public class synchronizedTest01 implements Runnable {
 private String name;
 private Object first;
 private Object next;
 public synchronizedTest01(String name,Object first,Object next) {
	// TODO Auto-generated constructor stub
	 this.name=name;
	 this.first=first;
	 this.next=next;
}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int count=10;
		while(count>0) {
		synchronized (first) {
			synchronized (next) {
				count--;
				System.out.print(this.name);
				next.notify();
			}
			    try {
					first.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		}
	}
	public static void main(String[] args) throws InterruptedException {
		Object a=new Object();
		Object b=new Object();
		Object c=new Object();
		synchronizedTest01 synchronizedtest01=new synchronizedTest01("A", a, b);
		synchronizedTest01 synchronizedtest02=new synchronizedTest01("B", b, c);
		synchronizedTest01 synchronizedtest03=new synchronizedTest01("C", c, a);
		new Thread(synchronizedtest01).start();
		Thread.sleep(100);
		new Thread(synchronizedtest02).start();
		Thread.sleep(100);
		new Thread(synchronizedtest03).start();
		Thread.sleep(100);
	}

}
