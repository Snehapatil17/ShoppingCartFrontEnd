/*package com.niit.shoppingcart.controller;





import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.shoppingcart.dao.CategoryDAO;
import com.niit.shoppingcart.dao.ProductDAO;
import com.niit.shoppingcart.dao.SupplierDAO;
import com.niit.shoppingcart.model.Category;
import com.niit.shoppingcart.model.Product;
import com.niit.shoppingcart.model.Supplier;






public class AdminController {
	
	@Autowired
	private Product product;
	
	@Autowired
	private ProductDAO productDAO;
	
	@Autowired
	private Category category;
	
	@Autowired
	private CategoryDAO categoryDAO;
	
	@Autowired
	private Supplier supplier;
	
	@Autowired
	private SupplierDAO supplierDAO;
	
	@RequestMapping("manageCategories")
	public ModelAndView categories()
	{
		ModelAndView mv= new ModelAndView("home");
		mv.addObject("category",category);
		mv.addObject("isAdminClickedCategories","true");
		mv.addObject("categoryList",categoryDAO.list());
		
		return mv;
		}
	
	
	@RequestMapping("manageProducts")
	public ModelAndView products()
	{
		ModelAndView mv= new ModelAndView("home");
		mv.addObject("product",product);
		mv.addObject("isAdminClickedProducts","true");
		mv.addObject("productList",productDAO.list());
		mv.addObject("category",category);
		mv.addObject("categoryList",categoryDAO.list());
		mv.addObject("supplierList",supplierDAO.list());
		mv.addObject("supplier",supplier);
		
		return mv;
		}
	
	@RequestMapping("manageSuppliers")
	public ModelAndView Suppliers()
	{
		ModelAndView mv= new ModelAndView("home");
		mv.addObject("product",product);
		mv.addObject("isAdminClickedSupplier","true");
		mv.addObject("productList",productDAO.list());
		mv.addObject("category",category);
		mv.addObject("categoryList",categoryDAO.list());
		mv.addObject("supplierList",supplierDAO.list());
		mv.addObject("supplier",supplier);
		
		return mv;
		}

}
*/