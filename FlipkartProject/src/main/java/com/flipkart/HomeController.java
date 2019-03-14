package com.flipkart;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class HomeController {
	private static final long serialVersionUID = 1L;
	
	@RequestMapping("/welcome")
	   public ModelAndView hello()
	   {
		   ModelAndView m=new ModelAndView("view/index");
		return m ;
	   }
}
	