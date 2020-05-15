package com.mastek.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FormProcess {
	
	@RequestMapping(value="/signup", method=RequestMethod.POST)
	public ModelAndView signup(@RequestParam(name="fname") String fname, 
			@RequestParam(name="mname") String mname, 
			@RequestParam(name="lname") String lname,
			@RequestParam(name="dob") String dob) 
	{	
		ModelAndView modelAndView=new ModelAndView("welcome");
        modelAndView.addObject("first_name",fname);
        modelAndView.addObject("middle_name",mname);
        modelAndView.addObject("last_name",lname);
        modelAndView.addObject("dob",dob);
        return modelAndView;
		
	}

}
