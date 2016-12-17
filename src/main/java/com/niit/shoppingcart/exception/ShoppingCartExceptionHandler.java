package com.niit.shoppingcart.exception;

import java.io.IOException;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;

import org.hibernate.hql.internal.ast.QuerySyntaxException;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.transaction.CannotCreateTransactionException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.NoHandlerFoundException;
@ControllerAdvice
public class ShoppingCartExceptionHandler {
	
	private static final org.slf4j.Logger logger= LoggerFactory.getLogger(ShoppingCartExceptionHandler.class);
			
	
	
	/*@ExceptionHandler(SQLException.class)
	public ModelAndView handleSQLException(HttpServletRequest request,Exception e){
			logger.error("SQLException Occured::URL="+request.getRequestURL());
			logger.error("SQLException Occured::Exception="+e.getMessage());
			ModelAndView  mv= new ModelAndView("error");
			mv.addObject("message","it seems one of the table does not exists");
			mv.addObject("errorMessage",e.getMessage());
			return mv;
			
			}
	
*/
	@ExceptionHandler(CannotCreateTransactionException.class)
	public ModelAndView dbServerNotStarted(HttpServletRequest request,Exception e){
			logger.error("SQLException Occured::URL="+request.getRequestURL());
			logger.error("SQLException Occured::Exception="+e.getMessage());
			ModelAndView  mv= new ModelAndView("error");
			mv.addObject("message","it seems database server not started");
			mv.addObject("errorMessage",e.getMessage());
			return mv;
			
			}
	
	@ExceptionHandler(QuerySyntaxException.class)
	public String handleQuerySyntaxException(HttpServletRequest request,Exception e){
			logger.error("SQLException Occured::URL="+request.getRequestURL());
			logger.error("SQLException Occured::Exception="+e.getMessage());
			ModelAndView  mv= new ModelAndView("error");
			mv.addObject("message","it seems database one of the query is not propersee the logger ");
			mv.addObject("errorMessage",e.getMessage());
			return "database_error";
			
			}
	
	
	@ExceptionHandler(NoHandlerFoundException.class)
	public ModelAndView noHandlerException(HttpServletRequest request,Exception e){
			logger.error("SQLException Occured::URL="+request.getRequestURL());
			logger.error("SQLException Occured::Exception="+e.getMessage());
			ModelAndView  mv= new ModelAndView("error");
			mv.addObject("message","not handler found");
			mv.addObject("errorMessage",e.getMessage());
			return mv;
			
			}
	
	@ResponseStatus(value=HttpStatus.NOT_FOUND,reason="IOException occured")
	@ExceptionHandler(IOException.class)
	public ModelAndView handleIOException(HttpServletRequest request,Exception e){
			logger.error("SQLException Occured::URL="+request.getRequestURL());
			logger.error("SQLException Occured::Exception="+e.getMessage());
			ModelAndView  mv= new ModelAndView("error");
			mv.addObject("message","not able to connect to server");
			mv.addObject("errorMessage",e.getMessage());
			return mv;
			
			}
			}
			
	