package com.zensar.careersolutionswebservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zensar.careersolutionswebservice.beans.Job;

public interface JobRepository extends JpaRepository<Job, Integer>{

}
