package com.wansan.test;
/*
 * �̳�Runbaleֻ��Ҫ��дrun����
 */
public class RunableTest01 implements Runnable {
    private String name;
    public  RunableTest01(String name) {
		// TODO Auto-generated constructor stub
    	this.name=name;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++) {
			System.out.println("����"+name+i);
		}
		try {
			Thread.sleep((int)Math.random()*10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
public static void main(String[] args) {
	new Thread(new RunableTest01("A")).start();
	new Thread(new RunableTest01("B")).start();

}
}
