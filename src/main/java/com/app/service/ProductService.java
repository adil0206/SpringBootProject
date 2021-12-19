package com.app.service;

import java.util.List;

import com.app.model.Product;

public interface ProductService {
	public int saveProduct(Product p);
	public List<Product> getAllProduct();
	public Product getProductById(Integer id);
	public void deleteProduct(Integer id);
}
