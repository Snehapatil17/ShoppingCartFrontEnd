package com.niit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.niit.shoppingcart.dao.SupplierDAO;
import com.niit.shoppingcart.model.Supplier;






public class SupplierController {


	
		@Autowired
		private SupplierDAO supplierDAO;
		
		@Autowired
		private Supplier supplier;
		
	//	private String path="D:\\frontend";
		//ModelAndView mv =new ModelAndView("home");
		
	@RequestMapping(value="/manage_categories",method=RequestMethod.GET)
	public  String listCategories(Model model)
	{
		model.addAttribute("supplier",supplier);
		model.addAttribute("supplierList",supplierDAO.list());
		model.addAttribute("isadminclickedsupplier","true");
		return "/home";
		
		}

	@RequestMapping(value="/manage_add",method=RequestMethod.POST)
	public  String addCategories(@ModelAttribute("supplier") Supplier supplier,Model model){
	ModelAndView mv=new ModelAndView("redirect:/home");
	if(supplierDAO.update(supplier)==true){
		model.addAttribute("msg","successfully created/updated the supplier");
		
	}else
	{
		model.addAttribute("msg","not able to create or update the supplier");
		}

		
		model.addAttribute("supplier",supplier);
		model.addAttribute("supplierList",supplierDAO.list());
		model.addAttribute("isadminclickedsupplier","true");
		return "/home";
		
		}


	@RequestMapping(value="/manage_categoriy_remove/(id)")
	//ModelAndView mv=new ModelAndView("redirect:/home");
	public  String deleteCategories(@PathVariable("id")String id,Model model)throws Exception
	{
	    boolean flag=supplierDAO.delete(id);
	String msg="successfully done the operation";
	if(flag!=true)
	{
		msg="the operation could not success";
	}

	model.addAttribute("msg",msg);
	//return "forword:/manage_categories";

		model.addAttribute("supplier",supplier);
		model.addAttribute("supplierList",supplierDAO.list());
		model.addAttribute("isadminclickedsupplier","true");
		return "/home";
		
		}


	}
	

