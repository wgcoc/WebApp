package com.gc.action;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

public class HomeController {
    @RequestMapping(value = "index")
    public String Index() {
        return "/jsp/index";
    }
}
