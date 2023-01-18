package com.zensar.careersolutionswebservice.service;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.zensar.careersolutionswebservice.beans.JobSeeker;


public interface ProductService {

	public Iterable<JobSeeker> getAllJobSeekers();
	
	public JobSeeker insertJobSeeker(JobSeeker jobSeeker);
	
	/*public Product getProduct(int productId);
	
	public Product insertProduct(Product product);
	
	public void delete(int productId);
	
	public void updateProduct(int productId,Product updatedProduct);
	
	List<Product> getByProductName(String productName);*/
}
