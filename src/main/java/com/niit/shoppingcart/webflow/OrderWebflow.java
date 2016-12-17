/*package com.niit.shoppingcart.webflow;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;

import com.niit.shoppingcart.model.BillingAddress;
import com.niit.shoppingcart.model.Cart;
import com.niit.shoppingcart.model.Order;
import com.niit.shoppingcart.model.PaymentMethod;
import com.niit.shoppingcart.model.Product;
import com.niit.shoppingcart.model.ShippingAddress;

public class OrderWebflow {

	@Autowired
	Cart cart;
	
	@Autowired
	Order order;
	
	@Autowired
	HttpSession httpSesion;
	
	@Autowired
	Product product;
	
	
	public Order initflow()
	{
		order=new Order();
		return order;
		
	}
	
	public String addShippingAddress(Order order,ShippingAddress shippingAddress)
	{
		try
		{
			order.setShippingAddress(shippingAddress);
			
		}catch(Exception e)
		{
			e.printStackTrace();
			return "fail";
		}
		return "success";
	}
	
	public String addBillingAddress (Order order, BillingAddress billingAddress)
	{
		order.setBillingAddress(billingAddress);
		return "success";
	}
	
	public String addPaymentMethod(Order order, PaymentMethod paymentMethod)
	{
		order.setPaymentMethod(paymentMethod);
		return "success";
}

}*/