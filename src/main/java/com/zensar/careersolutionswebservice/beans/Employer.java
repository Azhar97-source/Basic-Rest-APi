/*
 * package com.zensar.careersolutionswebservice.beans;
 * 
 * 
 * 
 * import javax.persistence.Column; import javax.persistence.Entity; import
 * javax.persistence.GeneratedValue; import javax.persistence.GenerationType;
 * import javax.persistence.Id;
 * 
 * 
 * 
 * @Entity public class Employer {
 * 
 * @Override public String toString() { return "Employer [employerId=" +
 * employerId + ", employerUserName=" + employerUserName + ", employerEmail=" +
 * employerEmail + ", employerContactNumber=" + employerContactNumber +
 * ", employerPassword=" + employerPassword + "]"; }
 * 
 * 
 * 
 * @Id
 * 
 * @GeneratedValue(strategy = GenerationType.AUTO) private int employerId;
 * 
 * @Column(name = "employerName") private String employerUserName;
 * 
 * @Column(name = "employerEmail") private String employerEmail;
 * 
 * @Column(name = "employerNumber") private String employerContactNumber;
 * 
 * @Column(name = "employerPassword") private String employerPassword;
 * 
 * public Employer() { super(); }
 * 
 * 
 * 
 * public Employer(int employerId, String employerUserName, String
 * employerEmail, String employerContactNumber, String employerPassword) {
 * super(); this.employerId = employerId; this.employerUserName =
 * employerUserName; this.employerEmail = employerEmail;
 * this.employerContactNumber = employerContactNumber; this.employerPassword =
 * employerPassword; }
 * 
 * 
 * 
 * public int getEmployerId() { return employerId; }
 * 
 * 
 * 
 * public void setEmployerId(int employerId) { this.employerId = employerId; }
 * 
 * 
 * 
 * public String getEmployerUserName() { return employerUserName; }
 * 
 * 
 * 
 * public void setEmployerUserName(String employerUserName) {
 * this.employerUserName = employerUserName; }
 * 
 * 
 * 
 * public String getEmployerEmail() { return employerEmail; }
 * 
 * 
 * 
 * public void setEmployerEmail(String employerEmail) { this.employerEmail =
 * employerEmail; }
 * 
 * 
 * 
 * public String getEmployerContactNumber() { return employerContactNumber; }
 * 
 * 
 * 
 * public void setEmployerContactNumber(String employerContactNumber) {
 * this.employerContactNumber = employerContactNumber; }
 * 
 * 
 * 
 * public String getEmployerPassword() { return employerPassword; }
 * 
 * 
 * 
 * public void setEmployerPassword(String employerPassword) {
 * this.employerPassword = employerPassword; }
 * 
 * 
 * 
 * 
 * 
 * }
 */