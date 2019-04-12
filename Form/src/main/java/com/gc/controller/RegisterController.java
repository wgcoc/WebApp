package com.gc.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import com.gc.model.User;

@Controller
public class RegisterController {
//    @RequestMapping(value = "index")
//    public String Index() {
//        return "/jsp/index";
//    }
	@RequestMapping(value="/register",method=RequestMethod.GET)
	public ModelAndView register() {
		User user = new User();
		user.setGender(0); //设定默认值
		ModelAndView modelAndView = new ModelAndView("register","command",user);//带参重定向 
		return modelAndView;
	}
	
	@RequestMapping(value="/getUserInfo",method=RequestMethod.POST)
	public String getInfo(@ModelAttribute("SpringWeb")User user,Model model) {
		model.addAttribute("id", user.getId());
		model.addAttribute("userName", user.getUserName());
		model.addAttribute("password", user.getPassword());
		model.addAttribute("gender", user.getGender());
		model.addAttribute("hoppies", user.getHoppies());
		model.addAttribute("country", user.getCountry());
		model.addAttribute("remark", user.getRemark());
		return "show";
	}
	
	@ModelAttribute("countriesList") //映射列表属性，给视图中的列表赋值
	public Map<String,String> getCountryList(){
		Map<String,String> countriesList = new HashMap<String,String>();
		countriesList.put("US", "America");
		countriesList.put("CN", "China");
		countriesList.put("JP", "Japan");
		countriesList.put("UK", "England");
		return countriesList;
	}
	
	@ModelAttribute("hoppiesList")
	public List<String> getHoppyList(){
		List<String> hoppies = new ArrayList<String>();
		hoppies.add("看书");
		hoppies.add("电影");
		hoppies.add("玩游戏");
		hoppies.add("拉二胡");
		hoppies.add("画画");
		return hoppies;
	}
}
