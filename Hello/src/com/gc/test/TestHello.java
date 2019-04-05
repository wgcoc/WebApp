//《Spring从入门到精通》 2.3 改写第一个Spring例子实现中英文输出
package com.gc.test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import com.gc.impl.Hello;;

public class TestHello {
	public static void main(String[] arg) {
		//通过ApplicationContenxt来获取Spring的配置文件
		ApplicationContext actx = new FileSystemXmlApplicationContext("config.xml");
		//通过Bean的id来获取Bean
		Hello hello = (Hello)actx.getBean("Hello");
		System.out.println(hello.doSalutation());
	}
}