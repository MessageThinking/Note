package com.wansan.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

/** 
* @author ���ߣ�wanwei 
* @version ����ʱ�䣺2017��10��25�� ����11:08:21 
* collection
* List(����,���ظ�,�ɴ���null):
* ArrayList:��ѯЧ�ʸ�(�ײ��������),ɾ������Ч�ʵ�,��Ϊ�޸ĵ�ʱ����Ҫ�ƶ���λ���Ƚ϶ࡣ
* LinkedList:˫������,˫�������������ݽṹģʽ�������ݽ��иĶ����������Ƕ��ڲ�ѯ��������Ҫ�ӵ�һ��ָ�뿪ʼ
* Ȼ��һֱ�ƶ����Ǹ�ƥ���ָ�����
* set(����,�����ظ�,���Դ���null,set��λ������hashCodeֵ����):
* HashSet:�ײ��Ǹ���hasCode��ʵ�ֵ�,��ȡ�ٶȺܿ졣��Ϊset�ǲ��ܹ��ظ���,����HashSetҲ�ǲ����ظ���.�����ڼ���
* �洢�Ķ����ǲ����Ѿ����ڵ�ʱ��,��Ҫ���hascodeֵ,���hascodeֵ��ͬ��ȥ����equals����ȥ��⡣��ArrayList�Ƚ�
* ArrayList�Ͳ���Ҫ���hasCodeֵ.HashSet�����̰߳�ȫ��.
* TreeSet:�����һ��Tree�ṹ����,Ĭ������Ȼ����.��� ���߽��бȽϷ��ص���0������ͬ��.
* ���Ԫ�ر�����бȽ���,����ʹ��Comparable�ӿڣ���дcompareTo����.����������бȽ��Խӿ�Comparator,
* ��дcompare����.
* �̰߳�ȫ��ArrayList,TreeSet,TreeMap,hasMap���̲߳���ȫ��.
* stringbuffer�̰߳�ȫ,StringBuilder�̲߳���ȫ��.
* HashTable��HashMap:HashTable���̰߳�ȫ��,HashMap���̲߳���ȫ��.
* HashTable������ռ�ֵ,hashMap����ռ�ֵ.
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
