package com.gc.action;
import java.util.Date;
public class HelloWorld {
	//存储字符串
	public String msg = null;
	//纯出日期
	public Date date = null;
	//构造函数
	//public HelloWorld(String msg) {
	//	this.msg = msg;
	//}
	//设定变量msg的set方法
	public void setMsg(String msg) {
		this.msg = msg;
	}
	//获取变量msg的get方法
	public String getMsg() {
		return this.msg;
	}
	//设定Date的set方法
	public void setDate(Date date) {
		this.date = date;
	}
	//获取变量date的get方法
	public Date getDate() {
		return this.date;
	}
}
