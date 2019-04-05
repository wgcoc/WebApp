//《Spring从入门到精通》 2.2 第一个使用Spring实现HelloWorld的例子
package com.gc.action;

public class HelloWorld {
	//存储字符串
	public String msg = null;
	//设定变量msg的set方法
	public void setMsg(String msg) {
		this.msg = msg;
	}
	//获取变量msg的get方法
	public String getMsg() {
		return this.msg;
	}
}
