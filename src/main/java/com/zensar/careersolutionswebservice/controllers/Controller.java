package com.zensar.careersolutionswebservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.thymeleaf.spring4.SpringTemplateEngine;

import com.zensar.careersolutionswebservice.beans.Employe;
import com.zensar.careersolutionswebservice.service.EmployerService;
import com.zensar.careersolutionswebservice.service.JobService;
import com.zensar.careersolutionswebservice.service.ProductService;

@RestController
//@CrossOrigin(origins="http://localhost:4200")
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
public class Controller {

	@Autowired
	SpringTemplateEngine templateEngine;

	@Autowired
	private JavaMailSender sender;

	@Autowired
	private ProductService service;

	@Autowired
	private EmployerService employerService;

	@Autowired
	private JobService jobService;

	@PostMapping(value = "/getdetails")
	public @ResponseBody Details sendMail(@RequestBody Details details) throws Exception {

		MimeMessage message = sender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(message, MimeMessageHelper.MULTIPART_MODE_MIXED_RELATED,
				StandardCharsets.UTF_8.name());

		Map<String, Object> model = new HashMap<String, Object>();
		model.put("name", details.getName());
		model.put("age", details.getAge());
		model.put("country", details.getCountry());
		model.put("phoneNumber", details.getPhoneNumber());

		Context context = new Context();
		context.setVariables(model);
		String html = templateEngine.process("email-template", context);

		try {
			helper.setTo(details.getEmail());
			helper.setText(html, true);
			helper.setSubject("Enquiry ");
		} catch (javax.mail.MessagingException e) {
			e.printStackTrace();
		}
		sender.send(message);

		return details;

	}

	@GetMapping("/jobSeekers")
	public Iterable<JobSeeker> getAllJobSeekers() {
		return service.getAllJobSeekers();
	}

	@PostMapping("/jobSeekers")
	public JobSeeker insertJobSeeker(@RequestBody JobSeeker jobSeeker) {
		return service.insertJobSeeker(jobSeeker);

	}

	@CrossOrigin(origins = "http://localhost:3000")

	@GetMapping("/employer")
	public Iterable<Employer> getAllEmployer() {
		return employerService.getAllEmployer();

	}

	@CrossOrigin(origins = "http://localhost:3000")

	@PostMapping("/employer")
	public void insertEmployer(@RequestBody Employe employe) {
		System.out.println("--------------------" + employe);
		employerService.insert(employe); // return
		employerService.insertEmployer(employe);
	}

	@CrossOrigin(origins = "http://localhost:3000")
	@PostMapping("/employe")
	public void insert(@RequestBody Employe employe) {
		System.out.println("--------------------" + employe);
		employerService.insert(employe);
		// return employerService.insertEmployer(employe);
	}

	@GetMapping("/job")
	public Iterable<Job> getAllJobs() {
		return jobService.getAllJobs();
	}

	@PostMapping("/job")
	public Boolean insertJob(@RequestBody Job job) {
		return jobService.insertJob(job);
	}

	@GetMapping("/employer/email/{email}/{password}") public Boolean
	  getByEmail(@PathVariable String email,@PathVariable String password) {
	  //System.out.println(email+""+ password); return
	  employerService.employerLogin(email, password);
	  
	  //employerEmail = employerService.employerLogin(email); //return
	  (employerEmail && employerPass);
	  
	  }

}
