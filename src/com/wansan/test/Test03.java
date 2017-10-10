package com.wansan.test;

public class Test03 extends Test02{
//	@Override
//	public void add (String b) {
//		System.out.println("aaa1");
//	} 
	public void add1 (String b) {
		System.out.println("22a1");
	} 
	public Test03() {
		System.out.print("子类构造器其");
	}
	public static void main (String[] args) {
		Test03 test=new Test03();
		Test02 test02=new Test03();
		test02.add("sss");
		//test.add("qq");
	}
}
