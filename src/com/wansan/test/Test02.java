package com.wansan.test;
/*
 * 1.java构造器在初始化的时候，首先必须在main方法中new一下
 * 不然无法初始化构造器，但是在java初始化的过程中,当初始化
 * 子类的时候需要首先初始化基类的构造器.(重要).
 * 2.toString 方法是Object类自带的如果你不对他进行重写,那么你
 * 打印的结果就是一个对象,所以你需要重写他,才能返回对应的变量，但是
 * 如果不是String类型的,你必须把这些变量转换成String类型进行转换.
 * 3.重载 就是改变这个方法的写法也就是方法面一样而已，可能其他的入参什么
 * 一个都不一样（返回值可能不一样,入参不一样）.
 * 重写 方法名和入参一样啦，一般都是在子类继承父类的情况下，一般子类
 * 想用父类的方法,但是不想原封不动的使用父类的方法的时候重写.
 * 4.类型转换，普通类型转换,可以从大的转换成小的,String类型转换成基本类型
 * 用那些基本的方法,引用类型的转换子类转成父类向上转很容易.
 */
 class Test02{
	 int d =(int) 1.1;
	 
	 int a=0;
	 String b="sss";
	 double c=21;
	 public Test02() {
		 System.out.println("sdsad");
	 }
	public void add(String s) {
		System.out.print("add");
	}
public String toString() {
	return b;
	
}
public static void main(String[] args) {
	Test02 test02=new Test02();
	System.out.print(test02);
}
}
