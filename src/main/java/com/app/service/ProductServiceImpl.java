package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.Product;
import com.app.repository.ProductRepository;
@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductRepository prodRepo;
	
	@Override
	public int saveProduct(Product p) {
		p=prodRepo.save(p);
		return p.getId();
	}

	@Override
	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product getProductById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteProduct(Integer id) {
		// TODO Auto-generated method stub

	}

}
