package com.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController  {
	@RequestMapping("/welcome")

	public ModelAndView helloworld(@PathVariable("username") String name) 
	{
      ModelAndView m = new ModelAndView("hello");
     m.addObject("wel", "hi user" );
      return m;
	}
}
