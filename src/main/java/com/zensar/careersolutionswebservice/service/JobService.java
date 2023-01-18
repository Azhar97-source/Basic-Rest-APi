package com.zensar.careersolutionswebservice.service;

import com.zensar.careersolutionswebservice.beans.Job;

public interface JobService {

	Boolean insertJob(Job job);
    boolean delete(int id);
    Iterable<Job> getAllJobs();
    
}
