package com.gc.action;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.logging.Logger;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
//import org.springframework.web.servlet.view.InternalResourceViewResolver;
//实现了Controller接口
public class HelloWorldAction implements Controller{
	private Logger logger = Logger.getLogger(this.getClass().getName());
	private String helloWorld;
	private String viewPage;
	//实现Controller接口中的handleRequest()方法
	public ModelAndView handleRequest(HttpServletRequest req,HttpServletResponse res) 
			throws ServletException,IOException {
		Map model = new HashMap();
		model.put("helloWorld", getHelloWorld());
		return new ModelAndView(getViewPage(),model);
	}
	//依赖注入要返回的界面
	public void setViewPage(String viewPage) {
		this.viewPage = viewPage;
	}
	//获取要返回的页面
	public String getViewPage() {
		return viewPage;
	}
	//依赖注入也显示在页面中的文字
	public void setHelloWorld(String helloWorld) {
		this.helloWorld = helloWorld;
	}
	//获取要显示在页面中的文字
	public String getHelloWorld() {
		return helloWorld;
	}
}
