package com.zensar.careersolutionswebservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.careersolutionswebservice.beans.Employe;
import com.zensar.careersolutionswebservice.repository.EmployeRepo;


@Service
public class EmployerServiceImpl implements EmployerService {

	/*
	 * @Autowired private EmployerRepository reopsitory;
	 */
	
	@Autowired
	private EmployeRepo repo;
	
	

	/*
	 * @Override public Iterable<Employer> getAllEmployer() { return
	 * reopsitory.findAll(); }
	 */
	/*
	 * @Override public Employer insertEmployer(Employer employer) { return
	 * reopsitory.save(employer); }
	 */
	/*
	 * @Override public Boolean employerLogin(String email,String password) {
	 * Employer emp = reopsitory.employerLogin(email,password);
	 * 
	 * if(emp!=null) { return true; }else { return false; }
	 * 
	 * }
	 */

	@Override
	public void insert(Employe employe) {
		repo.save(employe);
		
	}



	@Override
	public Boolean employerLogin(String email, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	//@Override
/*	public com.zensar.careersolutionswebservice.service.Employer insertEmployer(
			com.zensar.careersolutionswebservice.service.Employer employer) {
		// TODO Auto-generated method stub
		return null;
	}*/






}
