package com.zensar.careersolutionswebservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.careersolutionswebservice.beans.Job;
import com.zensar.careersolutionswebservice.repository.JobRepository;

@Service
public class JobServiceImpl implements JobService {

	 	@Autowired
	    private JobRepository repository;

	    @Override
	    public Boolean insertJob(Job job) {	        
	        if(repository.save(job)!=null)
	            return true;
	        else
	        return false;
	    }

	    @Override
	    public boolean delete(int id) {
	        repository.deleteById(id);
	        return true;
	    }

	    @Override
	    public Iterable<Job> getAllJobs() {
	        return repository.findAll();
	    }

}
