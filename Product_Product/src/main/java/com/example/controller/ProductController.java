package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.service.ProductService;
import com.example.model.Product;

public class ProductController {
	 @Autowired
	    private ProductService service;
	 
	    @GetMapping("/getProductById/{id}")
	    public Product getProductById(@PathVariable int id){
	        return service.getProductById(id);
	    }
	    @PostMapping("/addProduct")
	    public Product addProduct(@RequestBody Product product){
	        return service.addProduct(product);
	    }
	    @PutMapping("/updateProduct")
	    public Product updateCustomer(@RequestBody Product product){
	        return service.updateProduct(product);
	    }

}
