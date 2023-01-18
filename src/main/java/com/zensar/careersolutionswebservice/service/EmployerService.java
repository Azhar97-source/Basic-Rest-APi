package com.zensar.careersolutionswebservice.service;

import com.zensar.careersolutionswebservice.beans.Employe;


public interface EmployerService {

	/* Employer insertEmployer(Employer employer); */
	
	void insert(Employe employe);
   
	/* Iterable<Employer> getAllEmployer(); */
    
    
    Boolean employerLogin(String email,String password);
}
