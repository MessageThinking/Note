package com.wansan.test;
/*
 * ���߳��������ֶ�һ���̳�Thread�࣬��һ����ʵ��Runable�ӿ�
 * ע��start�����ظ�ʹ��,�ظ�ʹ�ûᱨ�쳣��
 * һ�������ж���߳�,��������Դ�������С��λ,�߳���CPU�������С��λ��
 * yield��һ������ģʽ,����˵��ǰ�к͵��ô˷������߳���ͬ�ȼ����߳�ʱ
 * �˷������÷������ó�CPU��Ȩ��,������߳�������������,���ʱ��Ҫ�����ú���߳�
 * ���ж�á�sleep�����õ����ȼ����߳�������,����sleep�������߳��ǽ����˵ȴ�״̬
 * ���ǿ�����״̬����sleepʱ���ڵ��߳̿϶����ᱻ���á�
 */
public class ThreadTest01 extends Thread{
    private String name;
    public ThreadTest01(String name) {
    	this.name=name;
    }
    public void run() {
    	for(int i=0;i<5;i++) {
    		System.out.println("����"+name+i);
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

