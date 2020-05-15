package com.mastek.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/greeting")//for any request 
public class GreetingController {


    @RequestMapping(method=RequestMethod.GET)
    public String getGreeting(ModelMap map) {
        map.addAttribute("message", "Welcome to Spring MVC sent");
        return "firstpage";
    }
    
    @RequestMapping(method=RequestMethod.POST)
    public ModelAndView postGreeting(ModelMap map) {
        map.addAttribute("message", "Welcome to Spring MVC posted ");
        return new ModelAndView("firstpage",map);
    }
}
