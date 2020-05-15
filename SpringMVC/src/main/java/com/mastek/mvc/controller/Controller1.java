package com.mastek.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/my-app")
public class Controller1 {
	
	@RequestMapping(method=RequestMethod.GET)
    public String getMyApp(ModelMap map) {
        map.addAttribute("message", "Welcome to my-app");
        return "my-app";
    }
	
	@RequestMapping(value="/greet", method=RequestMethod.GET)
    public String getGreeting(ModelMap map) {
        map.addAttribute("message", "Welcome to Spring my-app greet");
        return "firstpage";
    }
	
	@RequestMapping(value="/signup", method=RequestMethod.POST)
    public ModelAndView signup(@RequestParam(name="first_name") String first_name ) {
        ModelAndView modelAndView=new ModelAndView("welcome");
        modelAndView.addObject("first_name",first_name);
        return modelAndView;
    }

}
