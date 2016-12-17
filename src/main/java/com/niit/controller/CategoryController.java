package com.niit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.shoppingcart.dao.CategoryDAO;
import com.niit.shoppingcart.model.Category;

@Controller
public class CategoryController {

	@Autowired
	CategoryDAO categoryDAO;

	public CategoryDAO getCategoryDAO() {
		return categoryDAO;
	}

	public void setCategoryDAO(CategoryDAO categoryDAO) {
		this.categoryDAO = categoryDAO;
	}

	@Autowired
	Category category;

	private String path = "D:\\shoppingcart\\img\\";
	ModelAndView mv = new ModelAndView("home");

	@RequestMapping(value = "/manage_categories", method = RequestMethod.GET)
	public String listCategories(Model model) {
		List categoryList = categoryDAO.list();
		System.out.println("###" + categoryList.size());
		model.addAttribute("category", category);
		model.addAttribute("categoryList", categoryDAO.list());

		model.addAttribute("isadminclickedcategory", "true");
		return "/AllCategory";

	}

	@RequestMapping(value = "/manage_add", method = RequestMethod.POST)

	public String saveCategories(@ModelAttribute("category") Category category, Model model) {
		ModelAndView mv = new ModelAndView("redirect:/AddCategory");

		System.out.println("Besfore save");
		categoryDAO.save(category);
		System.out.println("Aftersave");
		model.addAttribute("category", category);
		model.addAttribute("categoryList", categoryDAO.list());
		model.addAttribute("isadminclickedcategory", "true");
		return "AddCategory";

	}

	@RequestMapping(value = "/manage_add", method = RequestMethod.GET)
	public String addCategories(@ModelAttribute("category") Category category, Model model) {
		ModelAndView mv = new ModelAndView("redirect:/AddCategory");
		if (categoryDAO.update(category) == true) {
			model.addAttribute("msg", "successfully created/updated the category");

		} else {
			model.addAttribute("msg", "not able to create or update the category");
		}

		model.addAttribute("category", category);
		model.addAttribute("categoryList", categoryDAO.list());
		model.addAttribute("isadminclickedcategory", "true");
		return "AddCategory";

	}

	@RequestMapping(value = "/manage_category_update{id}", method = RequestMethod.GET)
	public ModelAndView updateCategories(@RequestParam("id") String id, Model model) {
		ModelAndView mv = new ModelAndView("UpdateCategory");
		System.out.println("update controller");
		// categoryDAO.update(category);
		category = categoryDAO.get(id);
		model.addAttribute("category", category);
		model.addAttribute("categoryList", categoryDAO.list());

		return mv;
	}

	@RequestMapping(value = "/manage_category_update{id}", method = RequestMethod.POST)
	public ModelAndView updateCategory(@ModelAttribute("category") Category category, Model map) {

		ModelAndView mv = new ModelAndView("UpdateCategory");
		System.out.println("update controller1");
		categoryDAO.update(category);

		mv.addObject("category", category);
		mv.addObject("categoryList", categoryDAO.list());

		return mv;
	}

	@RequestMapping(value = "/manage_category_remove/{id}")
	// ModelAndView mv=new ModelAndView("redirect:/home");
	public String deleteCategories(@PathVariable("id") String id, Model model) throws Exception {
		boolean flag = categoryDAO.delete(id);
		String msg = "successfully done the operation";
		if (flag != true) {
			msg = "the operation could not success";
		}

		model.addAttribute("msg", msg);
		// return "forword:/manage_categories";

		model.addAttribute("category", category);
		model.addAttribute("categoryList", categoryDAO.list());
		model.addAttribute("isadminclickedcategory", "true");
		return "/home";

	}

}
