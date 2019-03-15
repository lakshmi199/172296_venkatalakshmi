package com.gontuseries.hellocontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController{
	@RequestMapping("/welcome")
	public ModelAndView helloworld()
	{
		ModelAndView modelandview = new ModelAndView("HelloPage");
		modelandview.addObject("welcomeMessage", "Hi User");
		return modelandview;
	}
}