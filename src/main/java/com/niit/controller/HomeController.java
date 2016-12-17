package com.niit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

//import javax.enterprise.inject.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	
	
	
		@RequestMapping("/")
	public String gotoHome()
	{
			
			return "index1";
		
	}
		
		@RequestMapping("/validate")
		public String validate(@RequestParam(name="uid")String id,@RequestParam(name="psw") String pwd,Model model)
		{
			System.out.println("hello");
		
		// HIT THE DB TO VALIDATE
		if(id.equals("niit") && pwd.equals("niit"))
		{
			model.addAttribute("successmessage","you successfully loged in");
			return "index1";
			
		}
		else
		{
			model.addAttribute("errormessage","invalid crential try again");
			return "index1";
		}
	}
		
		
	@RequestMapping("/login")
	public ModelAndView login()
	{
	
		ModelAndView mv=new ModelAndView("index1");
	mv.addObject("isuserclickedlogin","true");
	return mv;
	}
	
	@RequestMapping("/signup")
	public ModelAndView signup()
	{
		ModelAndView mv=new ModelAndView("index1");
		mv.addObject("isuserclickedsignup");
		return mv;
	}
	

	@RequestMapping("/home")
	public ModelAndView home()
	{
		ModelAndView mv=new ModelAndView("index1");
		mv.addObject("isuserclickedhome");
		return mv;
	}
	
	
	
	
	@RequestMapping("/nav")
	public ModelAndView nav()
	{
		ModelAndView mv=new ModelAndView("index1");
		mv.addObject("");
		return mv;
	}
	
	

	@RequestMapping("/contactus")
	public ModelAndView contactus()
	{
		ModelAndView mv=new ModelAndView("index1");
		mv.addObject("isuserclickedcontactus");
		return mv;
	}
	
	
	@RequestMapping("/mycart")
	public ModelAndView mycart()
	{
		ModelAndView mv=new ModelAndView("index1");
		mv.addObject("isuserclickedcart");
		return mv;
	}
	
}