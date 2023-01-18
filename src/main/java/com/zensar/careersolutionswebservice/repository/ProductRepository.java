package com.zensar.careersolutionswebservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.zensar.careersolutionswebservice.beans.JobSeeker;


public interface ProductRepository extends JpaRepository<JobSeeker, Integer>{

	
}
