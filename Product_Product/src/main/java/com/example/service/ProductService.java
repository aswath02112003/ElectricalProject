package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Product;
import com.example.repository.ProductRepository;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repo;




	public Product addProduct(Product product) {
		  return repo.save(product);
	}

	public Product updateProduct(Product product) {
		return repo.save(product);
	}

	public Product getProductById(int id) {
	    return repo.getProductByProductId(id);
	}

}
