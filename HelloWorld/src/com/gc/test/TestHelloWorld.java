//《Spring从入门到精通》 2.2 第一个使用Spring实现HelloWorld的例子
//					   4.2.4 Bean的属性 增加对当前时间输出的功能呢
package com.gc.test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import com.gc.action.HelloWorld;

public class TestHelloWorld {
	public static void main(String[] arg) {
		//通过ApplicationContenxt来获取Spring的配置文件
		ApplicationContext actx = new FileSystemXmlApplicationContext("config.xml");
		//通过Bean的id来获取Bean
		HelloWorld helloWorld = (HelloWorld)actx.getBean("HelloWorld");
		System.out.println(helloWorld.getDate() + " " + helloWorld.getMsg());
	}
}