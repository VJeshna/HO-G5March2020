package com.mastek.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mastek.app.model.User;

@Controller
public class UserController {
	
	@RequestMapping(value="/register", method=RequestMethod.POST)
	public ModelAndView onSubmit(@ModelAttribute User user) {
		
		ModelAndView mv = new ModelAndView("welcome");
		mv.addObject("user",user);
		
		return mv;
	}

}
