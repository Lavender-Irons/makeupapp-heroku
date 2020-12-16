package info.lavenderdawn.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import info.lavenderdawn.dao.ProductRepository;
import info.lavenderdawn.services.ProductService;

@Controller
public class HomeController {

	
	@Autowired
	ProductRepository productRepository;
	
	@Autowired
	ProductService productService;
	

	@GetMapping("/")
	public String listProducts(Model model) {
		
		return "main/home";
	}
	
	 

}
