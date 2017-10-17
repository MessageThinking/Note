package com.wansan.javapattem; 
/** 
* @author 作者：wanwei 
* @version 创建时间：2017年10月17日 上午10:31:59 
* 类说明 
*/
//懒汉模式
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
//饿汉模式
//public class danlimoshi{
//private danlimoshi(){};
//private static danlimoshi danlimoshi1=new danlimoshi();
//private static final danlimoshi getA(){
//return danlimoshi1;
//}
//}
