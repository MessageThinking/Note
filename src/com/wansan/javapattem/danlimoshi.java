package com.wansan.javapattem; 
/** 
* @author ���ߣ�wanwei 
* @version ����ʱ�䣺2017��10��17�� ����10:31:59 
* ��˵�� 
*/
//����ģʽ
public class danlimoshi {
   private danlimoshi() {};
   private static  danlimoshi danlimoshi1=null;
   private static danlimoshi getA() {
	   if(danlimoshi1==null) {
		   danlimoshi1=new danlimoshi();
	   }
	    return danlimoshi1;
   }
}
//����ģʽ
//public class danlimoshi{
//private danlimoshi(){};
//private static danlimoshi danlimoshi1=new danlimoshi();
//private static final danlimoshi getA(){
//return danlimoshi1;
//}
//}
