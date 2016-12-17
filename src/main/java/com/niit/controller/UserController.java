/*package com.niit.shoppingcart.controller;



import java.awt.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.shoppingcart.dao.CartDAO;
import com.niit.shoppingcart.dao.CategoryDAO;
import com.niit.shoppingcart.dao.SupplierDAO;
import com.niit.shoppingcart.dao.UserDAO;
import com.niit.shoppingcart.model.Cart;
import com.niit.shoppingcart.model.Category;
import com.niit.shoppingcart.model.Supplier;
import com.niit.shoppingcart.model.User;

@Controller
public class UserController {
	
	@Autowired
	User user;
	@Autowired
	UserDAO userDAO;
	
	@Autowired
	private CartDAO cartDAO;
	
	@Autowired
	private Cart cart;
	
	@Autowired
	private CategoryDAO categoryDAO;
	
	@Autowired
	private Category category;
	
	@Autowired
	private SupplierDAO supplierDAO;
	
	@Autowired
	Supplier supplier;
	
	private HttpSession session;
	@Autowired
	UserDAO userDAO;
	
	
	public ModelAndView authenticate (@RequestParam ("UserId"))
	{
	
	@RequestParam("password") String password;
	}
	
@RequestMapping (value="/ validate",method=RequestMethod.POST)
public ModelAndView validate(@RequestParam(value="username")String userID,
		@RequestParam(value="password")String password,HttpSession session)
{
  ModelAndView mv=new ModelAndView("redirect:/home");
  user=userDAO.isvalidUser(userID,userID);
  
  
  if(user!=null)
  {
   user=userDAO.get(userID);
   session.setAttribute("loggesInUser",user.getName());
   session.setAttribute("loggesInUserID",user.getId());
   
   session.setAttribute("user",user);
   if(user.getRole().equals("ROLE_ADMIN"))
   {
	   mv.addObject("isAdmin","true");
	   session.setAttribute("supplier",supplier);
	   session.setAttribute("supplierList", supplierDAO.list());
	   
	   session.setAttribute("category",category);
	   session.setAttribute("categoryList", categoryDAO.list());
	   
	   
   }
   
   else
   {
	   mv.addObject("isAdmin","false");
	   cart=cartDAO.get(userID);
	   mv.addObject("cart",cart);
	   List<Cart>cartList=cartDAO.list(userID);
	   mv.addObject("cartList",cartList);
	   mv.addObject("cartSize",cartList.size());
	   
   }
  }
  mv.addObject("invalidcredential","true");
  mv.addObject("errorMessage","invalid Credeentials");
  

return mv;
}


@RequestMapping("/logout")
public ModelAndView logout(HttpServletRequest request)
{
	ModelAndView mv= new ModelAndView("/home");
	session.invalidate();
	session=request.getSession(true);
	session.setAttribute("category",category);
	session.setAttribute("categoryList",categoryDAO.list());
	
	mv.addObject("logoutMessage","you successfully logged out");
	mv.addObject("loggedOut","true");
	return mv;
	}

@RequestMapping(value="/register",method=RequestMethod.POST)
public ModelAndView registerUser(@ModelAttribute User user)
{
	ModelAndView mv=new ModelAndView("home");
	  
	  
	  
	if (userDAO.get(user.getId())==null)
	{
		user.setRole("ROLE_USER");
		userDAO.save(user);
		mv.addObject("successMessage","you are successfully registered");
		
			
	}
	else{
		mv.addObject("errorMessage","user exist with this id");
	}
	return mv;
	}
@RequestMapping (value="/loginError",method=RequestMethod.GET)
public String loginError(Model model)

{
	model.addAttribute("errorMessage","login error");
	return "home";
	}

@RequestMapping(value="/accessDenied",method=RequestMethod.GET)

public String accessDenied(Model model)

{
	model.addAttribute("errorMessage","you are not authorized to access this page");
	return "home";
	}


}*/