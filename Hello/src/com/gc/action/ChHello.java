package com.gc.action;
import com.gc.impl.Hello;

public class ChHello implements Hello{
	//该变量用来存储字符串
	public String msg = null;
	//设定变量msg的se方法
	public void setMsg(String msg) {
		this.msg = msg;
	}
	//获取变量msg的get方法
	public String getMsg() {
		return this.msg;
	}
	//该方法用来输出中外问候语
	public String doSalutation() {
		return "你好 " + this.msg;
	}
}
