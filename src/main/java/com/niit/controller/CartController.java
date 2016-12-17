/*package com.niit.shoppingcart.controller;

import java.util.concurrent.ThreadLocalRandom;

import javax.servlet.http.HttpSession;

import org.apache.tomcat.util.net.jsse.openssl.Authentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.niit.shoppingcart.dao.CartDAO;
import com.niit.shoppingcart.dao.CategoryDAO;
import com.niit.shoppingcart.dao.ProductDAO;
import com.niit.shoppingcart.dao.SupplierDAO;
import com.niit.shoppingcart.model.Cart;
import com.niit.shoppingcart.model.Category;
import com.niit.shoppingcart.model.Product;
import com.niit.shoppingcart.model.Supplier;

public class CartController {

	

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
	
	@Autowired
	private Cart cart;
	
	@Autowired
	private CartDAO cartDAO;
	
	
	
	@RequestMapping(value="/cart",method=RequestMethod.GET)
	public String cart(Model model,HttpSession session)
	{
		model.addAttribute("cart",new Cart());
	     	String loggedInUserid=(String) session.getAttribute("loggedInUserID");
	     	
	     	if(loggedInUserid==null)
	     	{
	     		Authentication auth=SecurityContextHolder.getContext().getAuthentication();
	     		loggedInUserid=auth.getName();
	     	}
	     	
	     	int cartSize=cartDAO.list(loggedInUserid).size();
	     	if(cartSize==0)
	     	{
	     		model.addAttribute("errorMessage","u do not have any product in your cart");
	     		
	     	}
	     	else
	     	{
	     		model.addAttribute("cartList",cartDAO.list(loggedInUserid));
	     		model.addAttribute("totalAmount",cartDAO.getTotalAmount(loggedInUserid));
	     		model.addAttribute("displaycart","true");
	     		
	     	}
	     	
	     	return "/home";
	}
	
	//far add and update the cart
	
	@RequestMapping(value="/cart/add/{id}",method=RequestMethod.GET)
	public ModelAndView addToCart(@PathVariable("id") String id,HttpSession session,Model model)
	{
	Product product=productDAO.get(id);
	cart.setPrice(product.getPrice());
//	cart.setProductName(product.getName);
	
		
	     	String loggedInUserid=(String) session.getAttribute("loggedInUserID");
	     	
	     	if(loggedInUserid==null)
	     	{
	     		Authentication auth=SecurityContextHolder.getContext().getAuthentication();
	     		loggedInUserid=auth.getName();
	     	}
	     	
	     	int cartSize=cartDAO.list(loggedInUserid).size();
	     	if(cartSize==0)
	     	{
	     		model.addAttribute("errorMessage","u do not have any product in your cart");
	     		
	     	}
	     	cart.setUserID(loggedUserid);
	     	cart.setStatus('N');
	     	cart.setId(ThreadLocalRandom.current().nextLong(100,1000000+1));
	     	cartDAO.save(cart);
	     	ModelAndView  mv=new ModelAndView("redirect:/home");
	     	mv.addObject("successMessage","successfully add the product to cart");
	     	return mv;
	}


@RequestMapping("cart/delete/{id}")
public String removeCart(@PathVariable("id") String id,ModelMap model) throws Exception
{
	
	try
	{
		cartDAO.delete(id);
		model.addAttribute("message","successfully removed");
	}
	catch (Exception e)
	{
		model.addAttribute("message",e.getMessage());
		e.printStackTrace();
	}
        return "redirect:/home";
}

}

*/