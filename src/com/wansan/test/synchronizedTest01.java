package com.wansan.test;
/*
 * synchronized�߳�ͬ����������߳���ͬʱʹ�õ�ʱ��,�����׷�����ռ��Դ
 * �����,���Դ�ʱ��Ҫ��ͬ������ֹ�������⡣��synchronizedһ��ʹ�õ���
 * wait(),notify()��wait()���õ�ǰ�̵߳ȴ�,notify()���õ�ǰ�߳�����ʵ����
 * ��������ĵȴ�������ֻ�ǽ������������ͷź͸���,��������ȡʱ,���߳̿��Լ�������
 * �������ͷ�ʱ,�߳̾�ֹͣ����Ȼnotify()�������뻹��Ҫ��
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
