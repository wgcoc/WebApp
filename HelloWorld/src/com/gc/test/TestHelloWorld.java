//TestHelloWorld.java
package com.gc.test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import com.gc.action.HelloWorld;

public class TestHelloWorld {
	public static void main(String[] arg) {
		//通过ApplicationContenxt来获取Spring的配置文件
		ApplicationContext actx = new FileSystemXmlApplicationContext("config.xml");
		//通过Bean的id来获取Bean
		HelloWorld HelloWorld = (HelloWorld)actx.getBean("HelloWorld");
		System.out.println(HelloWorld.getMsg());
	}
}