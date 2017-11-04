package com.wansan.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

/** 
* @author 作者：wanwei 
* @version 创建时间：2017年10月25日 上午11:08:21 
* collection
* List(有序,可重复,可存入null):
* ArrayList:查询效率高(底层就是数组),删除增添效率低,因为修改的时候需要移动多位数比较多。
* LinkedList:双向链表,双向链表这种数据结构模式方便数据进行改动操作。但是对于查询操作则需要从第一个指针开始
* 然后一直移动到那个匹配的指针结束
* set(无序,不可重复,可以存入null,set的位置是由hashCode值定的):
* HashSet:底层是根据hasCode码实现的,存取速度很快。因为set是不能够重复的,所以HashSet也是不能重复的.所以在检验
* 存储的对象是不是已经存在的时候,需要检测hascode值,如果hascode值相同则去调用equals方法去检测。和ArrayList比较
* ArrayList就不需要检测hasCode值.HashSet不是线程安全的.
* TreeSet:这个是一个Tree结构集合,默认是自然排序.如果 两者进行比较返回的是0则是相同的.
* 如果元素本身具有比较性,可以使用Comparable接口，重写compareTo方法.如果容器具有比较性接口Comparator,
* 重写compare方法.
* 线程安全：ArrayList,TreeSet,TreeMap,hasMap是线程不安全的.
* stringbuffer线程安全,StringBuilder线程不安全的.
* HashTable和HashMap:HashTable是线程安全的,HashMap是线程不安全的.
* HashTable不允许空键值,hashMap允许空键值.
* 
* 
*/
public class ArrayListTest {
public static void main(String[] args) {
	LinkedList<String> test01=new LinkedList<String>();
	test01.add(null);
	test01.add("abc");
	System.out.println(test01);
	HashSet<String> test02=new HashSet<String>();
	test02.add(null);
	System.out.println(test02);
}
}
