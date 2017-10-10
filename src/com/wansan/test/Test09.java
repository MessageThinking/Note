package com.wansan.test;
/*
 * 继承中的向上转型和向下转型
 * 向上转型：自动转型,可以调用子类中已经重写过的方法.如果子类中没有调用的这个方法直接调用父类中这个方法.但是会遗失父类中没有的子类方法
 * (但是可以通过子类中的方法可以创建子类的对象获取)
 * 向下转型:需要强制转换。但是强转之后需要注意一点,子类的引用引用是不能够指向父类对象,即使在编译运行的
 * 时候不会报错,但是在调用方法的时候会报错java.lang.ClassCastException(类型转换出错)
 */
public class Test09 extends Test01{
	void fo1(int i) {
		System.out.print(i+1);
	}
	public void add() {
		System.out.print("aaaaa");
	}
	public void eat() {
		System.out.println("bbbb");
	}
	public static void main(String[] args) {
		//向下转型(这个时候会出现错误,因为子类的引用不能指向父类的引用)
		//Test01 test012=new Test01();
		//Test09 test09=(Test09) test012;
		//test09.fo1(2);
		//这样先向上转型再向下转型可以调用到父类和子类的方法
		Test01 test013=new Test09();
		Test09 test091=(Test09) test013;
		test091.fo1(2);
		test091.add();
	}
}
