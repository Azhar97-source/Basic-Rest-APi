package com.zensar.careersolutionswebservice.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class JobSeeker {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String fName;
	private String lName;
	
	private String email;
	private String highQual;
	
	private String address;
	
	private String dob;
	private String number;
	
	private String position;
	
	private String gender;
	

	public JobSeeker() {
		super();
	}
	

	public JobSeeker(int id, String fName, String lName, String email, String highQual, String address, String dob,
			String number, String position, String gender) {
		super();
		this.id = id;
		this.fName = fName;
		this.lName = lName;
		this.email = email;
		this.highQual = highQual;
		this.address = address;
		this.dob = dob;
		this.number = number;
		this.position = position;
		this.gender = gender;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getHighQual() {
		return highQual;
	}

	public void setHighQual(String highQual) {
		this.highQual = highQual;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "JobSeeker [id=" + id + ", fName=" + fName + ", lName=" + lName + ", email=" + email + ", highQual="
				+ highQual + ", address=" + address + ", dob=" + dob + ", number=" + number + ", position=" + position
				+ ", gender=" + gender + "]";
	}
	
	
	


	
	
}
