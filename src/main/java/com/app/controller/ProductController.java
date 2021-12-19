package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.app.model.Product;
import com.app.service.ProductService;

@Controller
public class ProductController {
	@Autowired
	private ProductService prodService;
	
	//show product with empty object
	@RequestMapping(value ="/")
	public String showReg(Model model) {
		Product product = new Product();
		model.addAttribute("product",product);
		return "registration";
	}
	@RequestMapping(value = "/save" ,method = RequestMethod.POST)
	public String saveProduct(@ModelAttribute("product") Product product,Model model) {
		Integer id=prodService.saveProduct(product);
		 if (id>0) {
			model.addAttribute("msg","success");
		} 
		 else
		 {
			 model.addAttribute("fail","failed");
		 }
		return "registration";
	}
}








