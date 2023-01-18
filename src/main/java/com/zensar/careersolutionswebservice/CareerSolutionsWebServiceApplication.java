package com.zensar.careersolutionswebservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.zensar.careersolutionswebservice.controllers.Controller;

@SpringBootApplication
public class CareerSolutionsWebServiceApplication implements CommandLineRunner {

	@Autowired
	private Controller controller;

	public static void main(String[] args) {
		SpringApplication.run(CareerSolutionsWebServiceApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		

	}

}
