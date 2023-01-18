package com.zensar.careersolutionswebservice.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employe {

	@Id
	private String id;
	@Column(name = "employerUserName")
	private String employerUserName;
	@Column(name = "employerEmail")
	private String employerEmail;
	@Column(name = "employerContactNumber")
	private String employerContactNumber;
	@Column(name = "employerPassword")
	private String employerPassword;

	public Employe() {
		super();
	}





	public Employe(String id, String employerUserName, String employerEmail, String employerContactNumber,
			String employerPassword) {
		super();
		this.id = id;
		this.employerUserName = employerUserName;
		this.employerEmail = employerEmail;
		this.employerContactNumber = employerContactNumber;
		this.employerPassword = employerPassword;
	}





	public String getEmployerUserName() {
		return employerUserName;
	}

	public void setEmployerUserName(String employerUserName) {
		this.employerUserName = employerUserName;
	}

	public String getEmployerEmail() {
		return employerEmail;
	}



	public String getId() {
		return id;
	}





	public void setId(String id) {
		this.id = id;
	}





	public void setEmployerEmail(String employerEmail) {
		this.employerEmail = employerEmail;
	}

	public String getEmployerContactNumber() {
		return employerContactNumber;
	}

	public void setEmployerContactNumber(String employerContactNumber) {
		this.employerContactNumber = employerContactNumber;
	}

	public String getEmployerPassword() {
		return employerPassword;
	}

	public void setEmployerPassword(String employerPassword) {
		this.employerPassword = employerPassword;
	}





	@Override
	public String toString() {
		return "Employe [id=" + id + ", employerUserName=" + employerUserName + ", employerEmail=" + employerEmail
				+ ", employerContactNumber=" + employerContactNumber + ", employerPassword=" + employerPassword + "]";
	}





}
