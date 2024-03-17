package com.virtualwaiter.crud.springbootvirtualwaiter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.virtualwaiter.crud.springbootvirtualwaiter.models.*;
import com.virtualwaiter.crud.springbootvirtualwaiter.services.ProductsRepo;

import jakarta.validation.Valid;

@Controller
@RequestMapping("products")

public class ProductsController {
	
	@Autowired
	private ProductsRepo repo;
	
	@GetMapping({"","/"})
	public String toList(Model model) {
		
		List<Product> products = repo.findAll();
		model.addAttribute("products", products);
		return "products/index";
	}
	
	@GetMapping("/create")
	public String createPage(Model model){
		
		ProductDto productDto = new ProductDto();
		model.addAttribute("productDto", productDto);
		return "products/create";
	}
	
	@PostMapping("/crear")
	public String createProduct(
			@Valid @ModelAttribute ProductDto productDto,
			BindingResult result) {
		
		if(result.hasErrors()) {
			return "products/create";
		}
		
		return "redirect:/products";		
	}
}
