package com.zensar.careersolutionswebservice.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.zensar.careersolutionswebservice.beans.JobSeeker;
import com.zensar.careersolutionswebservice.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductRepository reopsitory;
	
	
	@Override
	public Iterable<JobSeeker> getAllJobSeekers() {		
		return reopsitory.findAll();
	}
	
	@Override
	public JobSeeker insertJobSeeker(JobSeeker jobSeeker) {
		return reopsitory.save(jobSeeker);		
	}


	/*@Override
	public Product getProduct(int productId) {
		return reopsitory.findById(productId).get();
	}

	@Override
	public Product insertProduct(Product product) {
		return reopsitory.save(product);		
	}

	@Override
	public void delete(int productId) {
		reopsitory.deleteById(productId);
	}

	@Override
	public void updateProduct(int productId, Product updatedProduct) {
		//spring.datasource.url=jdbc:h2mem:productDbboot
		Product product = reopsitory.findById(productId).get();
		product.setPoductId(updatedProduct.getPoductId());
		product.setProductName(updatedProduct.getProductName());
		product.setProductCost(updatedProduct.getProductCost());
		
		reopsitory.save(product);
	}
	
	/*public List<Product> getByProductName(String productName) {
		
		return reopsitory.getByProductName(productName);
	}*/
	
	/*public List<Product> getByProductName(String productName){
		return reopsitory.giveMeProduct(productName);
	}*/
	
	

}
