/*package com.niit.shoppingcart.controller;






import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.niit.shoppingcart.dao.CategoryDAO;
import com.niit.shoppingcart.dao.SupplierDAO;
import com.niit.shoppingcart.model.Product;
import com.niit.shoppingcart.dao.ProductDAO;



@Controller
public class ProductController {
	private static final String ProductDAO = null;

	@Autowired 
	private CategoryDAO categoryDAO;
	
	@Autowired
	private Product product;
	
	@Autowired
	private ProductDAO productDAO;
	
	@Autowired
	private SupplierDAO supplierDAO;
	
	private String path="D:\\Shoppingcart\\images";
	
	@RequestMapping("/search_product/{search_string}")
	public ModelAndView getAllProductBySearchString(@PathVariable("search_string")String search_string)
	{
		List<Product> products=productDAO.getSimilarProducts(search_string);
		ModelAndView mv= new ModelAndView("/home");
		
		if(products.isEmpty())
		{
			mv.addObject("msg","no products are available with the search text :" +search_string);
		}
		else
		{
			mv.addObject("productList",products);
		}
		
		return mv;
	}
	
	
	
	@RequestMapping(value="/manage_products",method=RequestMethod.GET)
	public String listProducts(Model model)
	{
		model.addAttribute("product",new Product());
		model.addAttribute("productList",productDAO.list());
		model.addAttribute("isAdminClikedProducts","true");
		return "/AllCategory";
		
	}
	//for add and update product
	@RequestMapping(value="/manage_products_add",method=RequestMethod.POST)
	
	public String addProducts(@ModelAttribute("product")Product product, @RequestParam(" ") model)
	{
	
	Category product=productDAO.getByName(product.getCategory().getName());
	
	Supplier supplier=supplierDAO.getByName(product.getSupplier().getName());
	product.setCategory(product);
	product.setSupplier(supplier);
	
	product.setCategory_id(product.getid());
	product.setSupplier_id(supplier.getid());
	productDAO.saveOrUpdate(product);
	FileUtil.upload(path,file,product.getId()+".jpg");
	
	
		model.addAttribute("product",new Product());
		model.addAttribute("productList",this.ProductDAO.list());
		model.addAttribute("isAdminClikedProducts","true");
		return "/home";
		
	}
@RequestMapping("manage_product/remove/{id}")
public String removeProduct(@PathVariable("id") String id,ModelMap model) throws Exception{
try
{
	ProductDAO.delete(product);
	model.addAttribute("message","successfully added");
	
}
catch(Exception e)
{
model.addAttribute("message",e.getMessage());
e.printStackTrace();
}
return "forword:/manage_products";
}
	

}*/