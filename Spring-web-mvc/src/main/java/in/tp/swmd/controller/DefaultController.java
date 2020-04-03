package in.tp.swmd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DefaultController {
	@RequestMapping({"","/","/home"})
	public ModelAndView defaultGetRequestHandler() {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("home");
		mv.addObject("pageTitle","Home Page - Welcome All");
		
	    return mv;	
	}
	@RequestMapping("/header")
	public String showHeader() {
		return "header";
	}
	@RequestMapping("/footer")
	public String showFooter() {
		return "footer";
	}
   
}